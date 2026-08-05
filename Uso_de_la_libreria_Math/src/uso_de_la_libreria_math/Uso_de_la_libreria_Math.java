/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uso_de_la_libreria_math;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Uso_de_la_libreria_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

        double radio, area, circunferencia;

        System.out.print("Ingrese el radio del circulo: ");
        radio = leer.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;

        System.out.println("\nRESULTADOS");
        System.out.println("Area: " + area);
        System.out.println("Circunferencia: " + circunferencia);  
        
    }
    
}
