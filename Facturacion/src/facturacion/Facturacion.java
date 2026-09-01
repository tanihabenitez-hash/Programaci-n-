/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacion;

import java.util.Scanner;

/**
 *1. Definir el concepto de funcion / metodo 
     * 2. Conocer la estructua de una funcion
     * 3. Implementar funciones en el algoritmo 
     * 
     * Caracteristicas de laa funciones / metodos
     * 1. Reutilizable 
     * 2. Modular -> pequenias Tareas
     * 3. Mantenimiento 
     * Estructura de una funcion 
     * 1. Acceso de la funcion 
     *      Public, private, protected 
     * 2. Tipo de dato Retorna / Devuelve
     *      void -> SIN VALOR
     *      int, double
     *      char, String 
     *      boolean, long
     *      arraylist...
     * 3. Nombre de la funcion 
     * 4. Parametro de trabajo 
     *      int, double
     *      char, String 
     *      boolean, long
     *      arraylist...
 */
public class Facturacion {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        Scanner scan = new Scanner (System.in);
        
        final double ISV = 0.15;
        
        int precioProducto = 0;
        int cantidad = 0;
        double descuento = 0;
        double impuesto = 0;
        double subTotal = 0;
        double total = 0;
        
        //1ra funcion 
        MensajeBienvenida();
        
        //2da funcion
        System.out.print("Ingresa el precio del producto: ");
        precioProducto = scan.nextInt();
        ValidacionNumerica(precioProducto, scan);
        
        System.out.print("Cuantos productos llevas?");
        cantidad = scan.nextInt();
        cantidad = ValidacionNumerica(cantidad, scan);
       
        subTotal = precioProducto * cantidad;
          if (subTotal >100){
            descuento = subTotal * 0.10;
    }
        else {
            descuento = 0; 
        }    
        impuesto = (subTotal - descuento) * ISV;
         
        total = subTotal - descuento + impuesto;  

         //4to Funcion
         ResultadoFactura(subTotal, descuento,impuesto,total);
  
    }// fin de Main
   
    public static void MensajeBienvenida(){
        System.out.println("----------------------------------");
        System.out.println("SISTEMA DE FACTURACION");
        System.out.println("La logica de programacion");
        System.out.println("----------------------------------");
    
       
    }// Fin de la Funcion MensajeBienvenida

    public static int ValidacionNumerica(int numero, Scanner input){
    int numeroValido = numero;
    final int LIMITE = 0;
    do{
        if (numeroValido<LIMITE){
           System.out.println("Valor Numerico no puede");
           System.out.println("ser menos a 0");
           System.out.println("Ingrese Nuevamente el dato");
           numeroValido = input.nextInt();
        }
    }while (numeroValido<LIMITE);
return numeroValido;

}// Fin de la funcion ValidacionNumerica
          
    public static void ResultadoFactura (double sub,double des, double imp, double tot){
    
         System.out.printf("\nSubtotal: %.2f", sub);
         System.out.printf("\nDescuento: %.2f", des);
         System.out.printf("\nImpuesto : %.2f", imp);
         System.out.printf("\nPrecio a pagar: %.2f", tot);
    }//Fin de funcion ResultadoFactura

}// Fin class




