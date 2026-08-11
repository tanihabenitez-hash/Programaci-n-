/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de._aprobación_de_materia;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Sistema_de_Aprobación_de_Materia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        String nombre = "a";
        double nota1 = 0;
        double nota2 = 0;
        double promedio = 0;
        
        System.out.println("SISTEMA DE APROBACION");
        System.out.println ("------------------------------");
        
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese la nota del primer parcial:");
        nota1 = sc.nextDouble();
        
        System.out.println("Ingrese la nota del segundo parcial:");
        nota2 = sc.nextDouble();
        
        promedio = (nota1 + nota2)/ 2;
        
        System.out.println("\n----------------------------------"); 
        System.out.println("Estudiante: " + nombre); 
        System.out.println("Promedio final: " + promedio); 
        
        if (promedio >= 65) { 
        System.out.println("El estudiante esta Aprobado"); } 
        
        else { 
        System.out.println("El estudiante esta Reprobado"); } 
        
    }
    
}
