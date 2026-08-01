/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacion_de_sangre;

import java.util.Scanner;

/**
 *
 * @author abiga
 * /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */

/**
 * @author abiga
 
 
 */
 
public class Donacion_de_Sangre {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   Scanner entrada = new Scanner (System.in);
   
   int edad = 0;
   double  pesolibras = 0;
   boolean desayuno = true;
   char comio = 'a';
   int nivel = 0;
   String genero = "x"; 
   
        System.out.println("Bienvenido a la cruz roja");
        System.out.println("Sistema de control de donacion de sangre");
        System.out.println("Por favor, a continuacion ingresa tu edad");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese el peso");
        pesolibras = entrada.nextDouble();
        
        if (edad >= 18 && edad <= 65 && pesolibras >= 110) {
            entrada.nextLine();

            System.out.println("Si se puede donar");
            System.out.println("ya comio?");
            comio = entrada.nextLine().charAt(0);

            if (comio == 's' || comio == 's') {
                System.out.println("si se puede donar");

            } else {
                System.out.println("nesecita comer");
            }

        } else {
            System.out.println("no se puede donar");
              }
 
        System.out.println("Cuales son sus niveles de hierro");
        nivel = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Eres Masculino o Femenino");
        genero = entrada.nextLine().toUpperCase();

        if ((nivel >= 14 && genero.equals("MASCULINO"))
                || (nivel >= 12 && genero.equals("FEMENINO"))) {

            System.out.println("Si se puede donar sangre");

        } else {

        System.out.println("No se puede donar sangre");

         
     }
        
    }}

    
