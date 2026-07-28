/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Conversiones {

    /**
     *Objetivos 
     *Orden Secuencial de las instrucciones
     *Capturar Datos desde Teclado 
     *Operaciones Aritmeticas
     * 
     * Desarrollar un algoritmo que me permita convertir los siguientes
     * elemento:
     * 1.Pulgadas a Centimetros 
     * 2.Kilometros a Millas
     * 3.Grados Farenheit a grados celsius 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        // Declarar Variables
  int pulgadas = 0;
  double resultadoCM = 0;
  
  double kilometros = 0;
  double millas = 0;
  
  double farenheit = 0;
  double celsius = 0;
        
  pulgadas = 10; // -> Los datos van de derecha a izquierda 
  resultadoCM = pulgadas * 2.54;
  System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
  
  pulgadas = 35;
  resultadoCM = pulgadas * 2.54;
  System.out.printf("\n%.2f cm es igual a %d pulgadas",resultadoCM,pulgadas);
  
  System.out.println("");
  System.out.println("Cuantos kilometros hay de TGU - SPS?");
  kilometros = teclado.nextDouble();
  millas = kilometros / 1.6;
  System.out.printf("%.2f km es igual a %.2f millas",kilometros,millas);
  
 System.out.printf("Ingrese la temperatura en farenheit");
 farenheit = teclado.nextDouble();
 celsius = (farenheit -32) * 5/9;
 System.out.printf("%.2f farenheit equivale a %.2f grados celsius",farenheit,celsius);
 System.out.println("");
 
    }
    
}
