/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cálculo_con_dos_variables;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Cálculo_con_dos_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Scanner leer = new Scanner(System.in);

        double base, altura, area, perimetro;

        System.out.print("Ingrese la base del rectangulo: ");
        base = leer.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        altura = leer.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("\nRESULTADOS");
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
           
    }
    
}
