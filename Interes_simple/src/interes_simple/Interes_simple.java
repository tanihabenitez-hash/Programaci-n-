/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Interes_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);

        double capital, interes;
        int tasa, tiempo;

        System.out.print("Ingrese el capital inicial: ");
        capital = leer.nextDouble();

        System.out.print("Ingrese la tasa de interes anual (%): ");
        tasa = leer.nextInt();

        System.out.print("Ingrese el tiempo en años: ");
        tiempo = leer.nextInt();

        interes = (capital * tasa * tiempo) / 100.0;

        System.out.println("\nRESULTADOS");
        System.out.println("Capital: " + capital);
        System.out.println("Tasa: " + tasa + "%");
        System.out.println("Tiempo: " + tiempo + " años");
        System.out.println("Interes generado: " + interes);
      
        
    }
    
}
