/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensores_temperatura_ia;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Sensores_temperatura_IA {

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

System.out.println("========================================");
System.out.println("   ANALISIS DE SENSORES DE TEMPERATURA");
System.out.println("========================================");
System.out.println("Ingrese -999 para finalizar.");

System.out.print("\nIngrese una temperatura en grados Celsius: ");
temperatura = sc.nextDouble();

while (temperatura != -999) {

    if (temperatura < -273.15) {

        System.out.println("ERROR: La temperatura no puede ser menor a -273.15 °C.");

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

System.out.println("\n========================================");
System.out.println("             RESULTADOS");
System.out.println("========================================");

if (cantidadValida > 0) {

    double promedio = suma / cantidadValida;
    double diferenciaTermica = temperaturaMayor - temperaturaMenor;

    System.out.println("Cantidad de temperaturas validas: " + cantidadValida);
    System.out.printf("Promedio: %.2f °C%n", promedio);
    System.out.printf("Temperatura mas alta: %.2f °C%n", temperaturaMayor);
    System.out.printf("Temperatura mas baja: %.2f °C%n", temperaturaMenor);
    System.out.printf("Diferencia termica: %.2f °C%n", diferenciaTermica);

} else {

    System.out.println("No se ingresaron temperaturas validas.");
}

    }
}
