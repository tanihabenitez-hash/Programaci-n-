/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensores_de_temperatura;

import java.util.Scanner;

/**
 *Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
 *registradas por un sensor industrial. El programa debe detenerse cuando el usuario 
 * ingrese el valor centinela −999.

 * Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
 *el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
 *mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
 *Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
 *ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
 * 
 */
public class Sensores_de_Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        double temperatura = 0;
        double suma = 0;
        double temperaturaMayor = 0;
        double temperaturaMenor = 0;
        int cantidadValida = 0;

        System.out.println("ANALISIS DE SENSORES DE TEMPERATURA");
        System.out.println("----------------------------------------");
        System.out.println("Ingrese -999 para finalizar");

        System.out.println("Ingrese una temperatura en grados celsius:");
        temperatura = sc.nextDouble();

        while (temperatura != -999) {

            if (temperatura < -273.15) {
                System.out.println("ERROR: LA TEMPERATURA NO PUEDE SER MENOR A -273.15 °C");
            } else {
                suma = suma + temperatura;
                cantidadValida++;

                if (cantidadValida == 1) {
                    temperaturaMayor = temperatura;
                    temperaturaMenor = temperatura;
                } else {
                    if (temperatura > temperaturaMayor) {
                        temperaturaMayor = temperatura;
                    }

                    if (temperatura < temperaturaMenor) {
                        temperaturaMenor = temperatura;
                    }
                }
                System.out.println("Temperatura registrada correctamente.");

            }
            System.out.print("Ingrese otra temperatura (-999 para finalizar): ");
            temperatura = sc.nextDouble();
        }

        System.out.println("\nRESULTADOS");
        System.out.println("------------------");
        if (cantidadValida > 0) {

            double promedio = suma / cantidadValida;
            double diferenciaTermica = temperaturaMayor - temperaturaMenor;

            System.out.println("Cantidad de temperaturas validas: " + cantidadValida);
            System.out.println("Promedio: " + promedio + " °C");
            System.out.println("Temperatura mas alta: " + temperaturaMayor + " °C");
            System.out.println("Temperatura mas baja: " + temperaturaMenor + " °C");
            System.out.println("Diferencia termica: " + diferenciaTermica + " °C");

        } else {
            System.out.println("No se ingresaron temperaturas válidas.");
        }
    }

}
