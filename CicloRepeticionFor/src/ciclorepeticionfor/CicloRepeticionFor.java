/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 * Objetivos 
 * 1. Imprementar ciclo de repeticion FOR
 * 2. Uso de CONSTANTES 
 * 3. 
 *
 * @author abiga
 */
public class CicloRepeticionFor {

    /**
     * Se quiere contabilizar la cantidad
     * de minutos que se entregan a los ninos
     * y ninias en una fiesta. Con ello sacar
     * el porcentaje de cuantos fueron ninios
     * y ninias.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
           1. Varible de control -> Valor inicial       
           2. Condicion -> Limite 
           3. Modificador -> Incremento / Decremento        
        */
        
        for ( int i = 0; i<10 ;i++){
            System.out.printf("Valor: %d\n", i);
        } // Fin de ciclo FOR
        
        System.out.println("");
        System.out.println("2do ciclo FOR");
        
         for ( int i = 2; i<10 ;i +=2){
            System.out.printf("Valor: %d\n", i);
        } // Fin de ciclo FOR
        
       // Declaracion de variables 
       Scanner sc = new Scanner (System.in);
       final int TOTAL = 10;
       int numVarones = 0;
       int numMujeres = 0;
       char seleccion = 'a';
       double porcentaje = 0;
       
       
       for (int i = 0; i < TOTAL; i ++){
           System.out.println("Quien viene x minuta");
           System.out.println("V: Varon / M: Mujer");
           System.out.print("RESPUESTA: ");
           seleccion = sc.next().toUpperCase().charAt(0);
           
        switch (seleccion){
            case 'V':
            System.out.printf("%d) Varon comiendo minuta? \n", i+1);  
            numVarones++;
            break ;
            case 'M':
            System.out.println("Mujer comiendo minuta");  
            numMujeres++;
            break;
            
            default: 
            System.out.println("Seleccion no valida "); 
            break;
        }  
       }//Fin de Ciclo FOR
       
       System.out.println("Porcentaje de varones");
       porcentaje = (double)numVarones / TOTAL ;
       System.out.printf("Porcentaje: %.2f\n", porcentaje);
       
       System.out.println("Porcentaje de Mujeres");
       porcentaje = (double)numMujeres / TOTAL ;
       System.out.printf("Porcentaje: %.2f\n", porcentaje);
                          
         
    }
    
}
