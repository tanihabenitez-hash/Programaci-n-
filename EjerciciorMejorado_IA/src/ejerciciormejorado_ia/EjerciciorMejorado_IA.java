/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciormejorado_ia;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class EjerciciorMejorado_IA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" *TIENDA DE SOFTWARE*");
        System.out.println("-----------------------------");

        System.out.print("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();

        System.out.print("Tiene membresia premium? (S/N): ");
        char membresia = sc.next().charAt(0);

        System.out.print("Ingrese el precio del juego: ");
        double precio = sc.nextDouble();

        double descuento = 0;

        // Evaluación simplificada mediante operadores lógicos
        if (edad >= 18) {
            System.out.println("El cliente es mayor de edad.");
            if (edad > 65 || membresia == 'S' || membresia == 's') {
                descuento = 20;
            } else {
                descuento = 10;
            }
        } else {
            System.out.println("El cliente es menor de edad.");
            if ((membresia == 'S' || membresia == 's') && edad > 12) {
                descuento = 15;
            }
        }

        double cantidadDescuento = precio * descuento / 100;
        double totalPagar = precio - cantidadDescuento;

        System.out.println("\n--------------------------------------");
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Cantidad descontada: " + cantidadDescuento);
        System.out.println("Total a pagar: " + totalPagar);

        sc.close(); // Liberación de recurso
    }
}
        
        
        
        
        
        
        
    
    

