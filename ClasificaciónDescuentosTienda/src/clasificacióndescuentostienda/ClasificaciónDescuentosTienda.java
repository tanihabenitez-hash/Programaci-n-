/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificacióndescuentostienda;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class ClasificaciónDescuentosTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        Scanner sc = new Scanner(System.in);

        int edad = 0;
        char membresia = 'a';
        double precio = 0;
        double descuento = 0;
        double cantidadDescuento = 0;
        double totalPagar = 0;
        
        System.out.println(" *TIENDA DE SOFTWARE*");
        System.out.println("-----------------------------");

        System.out.print("Ingrese la edad del cliente: ");
        edad = sc.nextInt();

        System.out.print("Tiene membresia premium? (S/N): ");
        membresia = sc.next().charAt(0);

        System.out.print("Ingrese el precio del juego: ");
        precio = sc.nextDouble();

        if (edad >= 18) {

            System.out.println("El cliente es mayor de edad.");

            if (edad > 65) {

                descuento = 20;

            } else {

                if (membresia == 'S' || membresia == 's') {

                    descuento = 20;

                } else {

                    descuento = 10;
                }
            }

        } else {

            System.out.println("El cliente es menor de edad.");

            if (membresia == 'S' || membresia == 's') {

                if (edad > 12) {

                    descuento = 15;

                } else {

                    descuento = 0;
                }

            } else {

                descuento = 0;
            }
        }

        cantidadDescuento = precio * descuento / 100;

        totalPagar = precio - cantidadDescuento;

        System.out.println("\n--------------------------------------");
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Cantidad descontada: " + cantidadDescuento);
        System.out.println("Total a pagar: " + totalPagar);
       

    }
}
    

