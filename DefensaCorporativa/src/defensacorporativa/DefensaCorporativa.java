/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensacorporativa;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class DefensaCorporativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        final int SERVIDORES = 8;
        int[] cantidadIntentos = new int[SERVIDORES];
        int sumaAtaques = 0;
        int posicionServidor = 0;
        double promedio = 0;

        for (int i = 0; i < SERVIDORES; i++) {
            System.out.print("Ingresa ccantidad de intentos: ");
            cantidadIntentos[i] = ValidacionNumeroIngresado(scan);
        }

        sumaAtaques = TotalAtaquesRepelidos(cantidadIntentos);

        posicionServidor = ServidorMasAtacado(cantidadIntentos);

        promedio = CalculoPromedio(sumaAtaques, SERVIDORES);

        ImpresionResultados(sumaAtaques, posicionServidor, promedio);

    }//Fin de main

    public static int ValidacionNumeroIngresado(Scanner teclado) {
        int datoTemporal = 0;

        do {
            System.out.println("Lectura de dato Echo");
            System.out.print("Lectura: ");
            datoTemporal = teclado.nextInt();
            if (datoTemporal < 0) {
                System.out.println("Valor Ingresado");
                System.out.println("No puede ser negativo");
                System.out.println("Ingrese Nuevamente Dato");
                System.out.println("------------------------");
            }
        } while (datoTemporal < 0);
        return datoTemporal;
    }//Fin de Funcion ValidacionNumeroIngresado

    public static int TotalAtaquesRepelidos(int[] arregloAtaques) {
        int acumulador = 0;

        for (int i = 0; i < arregloAtaques.length; i++) {
            acumulador += arregloAtaques[i];
        }
        return acumulador;
    }//Fin funcion totalataquesrepelidos

    public static int ServidorMasAtacado(int[] arreglo) {
        int indice = 0;
        int mayorAtaque = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayorAtaque) {
                mayorAtaque = arreglo[i];
                indice = i;
            }//Fin if
        }//Fin cicloFor
        return indice;

    }//Fin Función ServidorMasAtacado

    public static double CalculoPromedio(int totalIntentos, int totalservidor) {
        double promedio = 0;

        promedio = totalIntentos / totalservidor;

        return promedio;
    }//Fin de CalculoPromedio

    public static void ImpresionResultados(int totalSumaA, int PoscServidor, double Promedio) {

        System.out.println("La suma total de los ataques es: ");
        System.out.println(totalSumaA);
        System.out.println("La posicion del servidor es: ");
        System.out.println(PoscServidor);
        System.out.println("El promedio es: ");
        System.out.println(Promedio);

    }//Fin de ImpresionResultados
}//Fin de class
