/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta_restaurante;

import java.util.Scanner;

/**
 *
 * @author abiga
 * Objetivos
 * 1.Conocer las diferentes tipos de ciclo repeticion
 * 2.Analizar los componentes de todo ciclo de repeticion 
 * 3.Construir un algoritmo con un ciclo de repeticion 
 */
public class Cuenta_Restaurante {

    /**
     * Desarrollar un algortimo que simule la cuenta de un resturante 
     *que se tiene que pagar entre un grupo de amigos (7) dividido en  
     * partes iguales
     * 
     * Ciclo repeticion 
     * 1.While
     * 2.Do - while
     * 3.For 
     * 4.Foreach 
     * 
     *Componentes de ciclo de repeticion
     * 1. Variable de control -> valor de inicio
     * 2. Condicion -> Limite de repeticion 
     *   Todo siglo de repeticion se ejecuta y se repite
     *   siempre y cuando la condicion se mantenga Verdadera
     * 3. Modificador de la variable de control 
     * 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double promedioPago = 0;
        int gastosIndividual = 0;

        int numPersona = 1; // Variable de control
        int GastoAcumulado = 0;
        // condicion -> Variable de control con limite 
        while (numPersona <= 7) {
            // Instrucciones a repetir 
            System.out.printf("Persona %d) Cuanto consumiste?", numPersona);
            gastosIndividual = sc.nextInt();

            GastoAcumulado += gastosIndividual; // suma los gatos 
            System.out.printf("P: %d\tGasto Ind: %d\tGasto ACUM: %d", numPersona, gastosIndividual, GastoAcumulado);
            System.out.println("");
            //Modificador 
            //Opcion #1
            // numPersona += 1;// numPersona = numPersona + ;

            //Opcion #2
            numPersona++; // Incremento Unitario (POST incremento
        }
        numPersona--;
        System.out.printf("\nTotal Personas: %d", numPersona);
        promedioPago = GastoAcumulado / numPersona;

        System.out.printf("\nGastos promedio x Persona: %.2f", promedioPago);

      
       }
       
       
        
    }
    
