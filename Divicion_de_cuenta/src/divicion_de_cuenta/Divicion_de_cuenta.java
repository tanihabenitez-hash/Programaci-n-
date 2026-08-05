/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divicion_de_cuenta;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class Divicion_de_cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);

        double cuentaTotal, pagoPorPersona;
        int personas;

        System.out.print("Ingrese el monto total de la cuenta: ");
        cuentaTotal = leer.nextDouble();

        System.out.print("Ingrese la cantidad de personas: ");
        personas = leer.nextInt();

        pagoPorPersona = cuentaTotal / personas;

        System.out.println("\nRESULTADO");
        System.out.println("Cada persona debe pagar: " + pagoPorPersona);
        
        
    }
    
}
