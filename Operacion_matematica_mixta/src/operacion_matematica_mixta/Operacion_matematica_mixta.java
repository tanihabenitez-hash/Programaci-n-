/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacion_matematica_mixta;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Operacion_matematica_mixta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = leer.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("\nRESULTADO");
        System.out.println("Temperatura en Celsius: " + celsius);

        
        
    }
    
}
