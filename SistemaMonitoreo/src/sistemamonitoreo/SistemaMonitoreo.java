/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 *Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
 * 
 * 1. Comprender el problema que esta abordando
 *    a. Que datos de entrada necesito 
 *    b. Transformacion / calculos necesarios 
 *    c. Que resultado se presenta?
 *  
 * 2. Visualizacion / Diseño de la solucion
 *    a. Diagrama de flujo
 *    b. Pseudocodigo 
 * 
 * 3. Programacion Incremental
 *    a. Listado de tareas a cumplir 
 *       i. Declaracion de variables 
 *       ii. Estructura de seleccion
 *       iii. Ciclos de repeticion 
 *       iv. Validacion de datos 
 *    b. Validacion
 * 
 * 4. Prueba de Escritorio 
 *    a. Casos 
 *    b. Escenarios
 *    c. Resultados / Patrones definidos 
 */
/**
 * Comprension problema 
 * 1. Entrada:
 *    Nombre de usuario 
 *    Numero de lecturas
 *    Ingreso de temperatura (RANDOM)
 * 2. Calculos/Transformacion 
 *    Formula Celsius - Farenheit 
 *    Definicion de sobrecalentamiento 
 *    Validacion Lecturas ( 0 > lectura menor 50)
 *    Contabilizar el numero calentamiento 
 *    Promediar el monitoreo 
 *    -Validacion Temperatura 
 * 
 * 3. Salida 
 *    Resumen Estadistico 
 *    Alerta de sobrecalentamiento 
 * 
 * 4. Lista de tareas 
 * 1. Capturar el nombre del usuario 
 *    a. Definicion de libreria / Instancia 
 *    b. Declaracion de variable para el usuario 
 * 2. Capturar el nombre del usuario 
 *    a. Declaracion de variable para numero de lectura
 * 3. Generacion de temperatura 
 *    a. Definicion de libreria RANDOM
 *    b. Declaracion de variable 
 *    c. Mostrar el numero random generando temporalmente 
 *    d. Rango de temp 200 - 400
 *    e. Ciclo de repeticion, WHILE
 * 
 * 4. Formula: F = (c * 9/5) + 32
 * 5. Limite de sobrecalentamiento 350 C (662 F)
 *       Esctructura de seleccion (IF/ELSE)I
 * 6. Validacion de Lectura (DO WHILE)
 * 7. Sumar los numeros de sobrecalentamiento 
 * 8. Calcular el promedio 
 * 9. Mostrar el resumen 
 *     Promedio 
 *   # de sobrecalentamiento 
 * 10. Generar una Alerta de sobrecalentamiento 
 * 
 *    
 * @author abiga
 */

public class SistemaMonitoreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);
        Random RD = new Random();

        String nombreUsuario = "John Doe";
        int numLectura = 0;
        int ciclo = 0;
        double tempC = 0;
        double tempF = 0;
        int numsobreCalentamiento = 0;
        double promedio = 0;
        double acumTEMP = 0;

        System.out.print("Nombre de operacion:");
        nombreUsuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar Captura:  %s\n", nombreUsuario);

                do {
            System.out.print("Numero de lecturas:");
            numLectura = sc.nextInt();
           
            if (numLectura <= 0 || numLectura > 50){
            System.out.println("VALOR NO VALIDO");
            System.out.println("Tiene que ser entre 0 y 50");
            }
            
        } while (numLectura <= 0 || numLectura > 50);

        while (ciclo < numLectura) {

            tempC = RD.nextDouble(200, 500);
            tempF = (tempC * 9 / 5) + 32;
            //tempC = (Math.random() * 500) - 300 + 200;
            System.out.printf("Num Lec: %d\tTem C: %.2f\n", ciclo + 1, tempC);
            System.out.printf("Temp en Faren: %.2f\n", tempF);

            if (tempF > 662) {
                System.out.println("Alerta!!... SOBRECALENTAMIENTO");
                numsobreCalentamiento++;

            } else {
                acumTEMP += tempF;

            }
            ciclo++;
        }//Fin de while
        promedio = acumTEMP / numLectura;
        
        System.out.println("----------------------------------");
        System.out.println("             RESUMEN              ");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.printf("Promedio de TEMP: %.2f\n",promedio);
        System.out.printf("# SobreCalentamiento: %d", numsobreCalentamiento);
    }

}
