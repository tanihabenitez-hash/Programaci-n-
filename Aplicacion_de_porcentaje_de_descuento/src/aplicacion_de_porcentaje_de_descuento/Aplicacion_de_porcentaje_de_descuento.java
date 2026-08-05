/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion_de_porcentaje_de_descuento;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Aplicacion_de_porcentaje_de_descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);

        double precio, descuento, montoDescuento, precioFinal;

        System.out.print("Ingrese el precio del articulo: ");
        precio = leer.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        descuento = leer.nextDouble();

        montoDescuento = (precio * descuento) / 100;
        precioFinal = precio - montoDescuento;

        System.out.println("\nRESULTADOS");
        System.out.println("Descuento: " + montoDescuento);
        System.out.println("Precio final: " + precioFinal);

    }
}
        
        
        
  