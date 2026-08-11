/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritméticaconsola;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class CalculadoraAritméticaConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
 
        Scanner RD = new Scanner(System.in);

        int numero1;
        int numero2;
        char operador;
        double resultado;

        
        System.out.println("        CALCULADORA ARITMETICA");
        System.out.println("--------------------------------------");

        System.out.print("Ingrese el primer numero: ");
        numero1 = RD.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = RD.nextInt();

        System.out.print("Ingrese la operacion (+, -, *, /, %): ");
        operador = RD.next().charAt(0);

        switch (operador) {

            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero");
                }
                break;

            case '%':
                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede realizar modulo entre cero");
                }
                break;

            default:
                System.out.println("Operador no reconocido");
             
            break; 
        }

    }
}


    


        
  
