/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidadesfísicas;

import java.util.Scanner;

/**
 *2. Conversor de Unidades Físicas (Uso Do-while)
*Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso.
* El menú debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y 4) Salir.
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden ser negativos.
* Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de error y volver a pedir el dato.
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la operación aritmética correspondiente. 
* El menú debe repetirse usando do-while hasta que el usuario elija la opción 4.

 * 
 */
public class ConversorUnidadesFísicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        double magnitud = 0;
        double resultado = 0;

        do {

            System.out.println("\nCONVERSOR DE UNIDADES FISICAS");
            System.out.println("----------------------------------------");
            System.out.println("1. Metros a Pies");
            System.out.println("2. Kilogramos a Libras");
            System.out.println("3. Centimetros a Pulgadas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese la cantidad de metros: ");
                    magnitud = sc.nextDouble();

                    while (magnitud < 0) {
                        System.out.println("ERROR: La longitud no puede ser negativa.");
                        System.out.print("Ingrese nuevamente la cantidad de metros: ");
                        magnitud = sc.nextDouble();
                    }

                    resultado = magnitud * 3.28084;

                    System.out.println("Resultado: " + resultado + " pies");

                    break;

                case 2:

                    System.out.print("Ingrese la cantidad de kilogramos: ");
                    magnitud = sc.nextDouble();

                    while (magnitud < 0) {
                        System.out.println("ERROR: El peso no puede ser negativo.");
                        System.out.print("Ingrese nuevamente la cantidad de kilogramos: ");
                        magnitud = sc.nextDouble();
                    }

                    resultado = magnitud * 2.20462;

                    System.out.println("Resultado: " + resultado + " libras");

                    break;

                case 3:

                    System.out.print("Ingrese la cantidad de centimetros: ");
                    magnitud = sc.nextDouble();

                    while (magnitud < 0) {
                        System.out.println("ERROR: La longitud no puede ser negativa.");
                        System.out.print("Ingrese nuevamente la cantidad de centimetros: ");
                        magnitud = sc.nextDouble();
                    }

                    resultado = magnitud / 2.54;

                    System.out.println("Resultado: " + resultado + " pulgadas");

                    break;

                case 4:

                    System.out.println("Saliendo del conversor...");

                    break;

                default:

                    System.out.println("ERROR: Opcion no valida. Seleccione una opcion del 1 al 4.");
            }

        } while (opcion != 4);

    }

}
