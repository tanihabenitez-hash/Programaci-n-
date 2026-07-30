/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccionvehiculo;

import java.util.Scanner;

/**
 *
 * @author abiga
 * OBJETIVOS
 * Estructuras de seleccion 
 * 1. Estructura o formato
 *    a. Palabras claves 
 *    b. Bloques
 *    c. Terminaciones 
 *    d. Condiciones 
 * 2. Tipo de seleccion 
 *    a. simples
 *    b.Doble 
 * 3. condiciones 
 *    a. Tipos de condiciones 
 *       i.   > -> mayor 
 *       ii.  < -> menor 
 *       iii. >= -> mayor o igual
 *     
 *
 *    b. Tipos de comparaciones 
 */
public class SeleccionVehiculo {

    /**
     * @param args the command line arguments
     * Desarrollar un algortimo que me permita determinar los siguientes elemento
     * (Datos numerico)
     * de un vehiculo 
     * a. Si el tamaño del tanque de combustible agarra mas de 30 litros
     * b. El tipo de combustible si es o no Diesel (dato tipo caracter)
     * c. si es energeticamente eficiente y ecologico (Dato cadena)
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
 Scanner entrada = new Scanner (System.in);
 int cantidadLitros=0;
 char respuestaTipo = 0; 
 String respuestaCadena = "Jonh Doe";
 
 System.out.println("Me dijeron que eres duenio de un vehiculo \"Verde\"");
 System.out.println("Tienes que echar biodiesel");
 System.out.print("Cuantos litros agarra?");
 cantidadLitros = entrada.nextInt();
 
 if(cantidadLitros>30){
     System.out.println("Esun vehiculo con");
     System.out.println("grandes capacidades");
     System.out.println("seguro la factura es alta!!!");
 }
 System.out.println("");
 entrada.nextLine();
 System.out.println("Tu vehiculo es Diesel? (x = si, y = no");
 respuestaTipo = entrada.nextLine().charAt (0);
 
 if (respuestaTipo == 'x'){
 System.out.println("Si es Diesel verde!!");
 System.out.println("Diesel combinado con ethanol");
 System.out.println("Se saca del maiz");
 }
 
 else
 {
     //condicion falsa
     System.out.println("Uyy... eres anticlimatico");
     System.out.println("Calentamiento Global!!!"); 
        
    }
    /* System.out.println("");
     System.out.println("Tu carro es energeticamente eficiente");
     respuestaCadena = entrada.nextLine();
     System.out.printf("Respuesta ingresada: %s",respuestaCadena);
     
     System.out.println("\nSeguro que es asi?");
     respuestaCadena = entrada.nextLine().toUpperCase();
     System.out.printf("Respuesta ingresada: %s", respuestaCadena);
     
    System.out.println("\n100% seguro?");
    respuestaCadena = entrada.next()toLowerCase();
    System.out.printf("\nRespuesta ingresada: %s", respuestaCadena);
    */

    if (respuestaCadena.equals("si")){
       System.out.println("Excelente");
       System.out.println("Amigable con el ambiente");
    }
    else {
        System.out.println("Uyy... busca que se puede hacer");
    }
 
}
    
}
