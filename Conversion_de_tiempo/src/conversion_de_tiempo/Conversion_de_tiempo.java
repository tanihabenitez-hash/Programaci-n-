/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion_de_tiempo;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Conversion_de_tiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int minutos, horas, minutosRestantes;

        System.out.print("Ingrese la cantidad de minutos: ");
        minutos = leer.nextInt();

        horas = minutos / 60;
        minutosRestantes = minutos % 60;

        System.out.println("\nRESULTADO");
        System.out.println(minutos + " minutos equivalen a:");
        System.out.println(horas + " horas y " + minutosRestantes + " minutos.");
    }
    
}
