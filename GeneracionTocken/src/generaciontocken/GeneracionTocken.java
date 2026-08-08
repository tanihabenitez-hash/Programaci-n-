/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciontocken;

import java.util.Random;
import java.util.Scanner;

/**
 * Desarrollar un algoritmo que me permita registar un dispositivo
 * y generar un token para su sesion de validacion mientras esta 
 *navegando con dicho dispositivo 
 * 
 * Contexto del problema: Un sistema de gestion de red, necesito
 * registrar nuevos enrutadores (routers) y asignarle una clase de 
 * sesion unico generada aletoriamente , sin embargo, el canal de
 * comunicacion tiene "ruido" por lo que la generacion de la clave 
 * no siempre es constante. 
 * 
 * 
 *
 * @author abiga
 */
public class GeneracionTocken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       Random RD = new Random(); 
       
       boolean longitudCorrecta = true; 
       boolean prefijoCorrecto = true; 
       boolean validacionCorrecta = true; 
       int tipoCaracter = 0;
       int numtoken = 0;
       char letraToken = 'a';
       String token = "a";
       
       do{
           String nombreEquipo = "a";
       
       System.out.println("Ingrese el nombre de su equipo");
       nombreEquipo = sc.nextLine().toUpperCase();
       
       System.out.printf("\nNombre del equipo: %s\n", nombreEquipo);
       
       longitudCorrecta = nombreEquipo.length() == 8;
       prefijoCorrecto = nombreEquipo.startsWith("RT") || nombreEquipo.startsWith("SW");
       
       //System.out.println(longitudCorrecta);
       //System.out.println(prefijoCorrecto);
       
       validacionCorrecta = longitudCorrecta && prefijoCorrecto;
           
           
       } while (!validacionCorrecta); // se va a ejecutar almenos una vezn no importa si es true o false
      
        System.out.println("Registro Correcto");
        
        
        if(token.length()<12){
        tipoCaracter = RD.nextInt(2);
        
        numtoken = RD.nextInt(10);
        token = token + numtoken;
        }
        
        else{
        letraToken = (char)(RD.nextInt(26)+65);
        token = token + letraToken;
         }// END ELSE
        System.out.printf("token es: %s", token);
        
        }
    
    }
    

