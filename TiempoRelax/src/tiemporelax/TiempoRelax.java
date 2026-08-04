/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author abiga
 * Obejtivos
 * 1. Seleccion Multiples
 *    a. Estructura
 *    b. Tipos de Condicion
 * 2. Formateo de cadena (printf)
 */
public class TiempoRelax {

    /**
     * Desarrollar algoritmo que me permita escoger un pais a visitar
     * posteriormente a ello, debemos nosotros escoger las posibles ciudadea 
     *a recorrer, sin embargo, solo se puede una ciudad 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int seleccionMenu = 0;
        char seleccionSubMenu = '@';
        
        
        System.out.println("Agencia de viajes");
        System.out.printf("|%20s| |%-20s| \n", "Taniha's Travel","Buen viaje");
        System.out.println("---------------------------------------");
              
        System.out.println("1.Japon");
        System.out.println("2.Francia");
        System.out.println("3.Nueva Zelanda");
        System.out.println("4.Canada");
        System.out.print("Respuesta:");
        seleccionMenu = sc.nextInt();
        
        /*
        if/else -> Rango de Valores
        switch -> Igualdad / Todas opciones estan mismo nivel
        */
        
        switch(seleccionMenu){
            case 1:
                System.out.println("Bienvenido a yokoso");
                System.out.println("Bienvenido a Japon");
                System.out.println("--------------------");
                
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("c. Kioto");
                System.out.print("Respuesta:");
                
                sc.nextLine(); //Limpieza de Buffer
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                switch (seleccionSubMenu){
                    case 'A':
                        System.out.println("Super Nintento World Tour");
                     break;
                    case 'B':
                        System.out.println("Car Meet");
                     break;  
                    default:
                        System.out.println("No ve que no esta esa opcion!!!");
                        break;
           
                         
                } // fin de SwitchSubMenu
               System.out.println("1. Paris");
            case 2:
                System.out.println("Bienvenido a france");
                System.out.println("Bienvenido a francia");
                
                System.out.println("1. Paris");
                System.out.println("2. Marsella");
                System.out.println("3. Lyon");
                System.out.print("Respuesta:");
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().charAt(0);
                switch (seleccionSubMenu) {
                    case '1':
                        System.out.println("Torre Eiffel");
                        break;

                    case '2':
                        System.out.println("Palacio de Marshella");
                        break;

                    case '3':
                        System.out.println("El Estadio!!");
                        break;
                    default:
                        System.out.println("No ve que no esta esa opcion!!!");
                        break;
                }
                   
                break;
            case 3:
                System.out.println("Nau mai, haere mai!");
                System.out.println("Bienvenido a Nueva Zelanda");
                System.out.println("---------------------------------");
               
                System.out.println("A. Sky Tower");
                System.out.println("B. Hodbbiton");
                System.out.println("C. Mildford Sound");
                System.out.print("Respuesta:");
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                
                if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='C'){
                    System.out.printf("%s Mildford Sound %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }
                  
                break;  
                
             case 4:
                System.out.println("Welcome to Canada!");
                System.out.println("Bienvenido a Canada");
                break;
        }
        
    }
    
}
