/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulación_trayectoria_balística;

import java.util.Scanner;

/**
 *3. Simulación de Trayectoria Balística (Uso estricto de for)
 *Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
 *velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
 *correspondiente a la trayectoria.
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
 * 
 */
public class Simulación_Trayectoria_Balística {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
         Scanner sc = new Scanner(System.in);

        double velocidadInicial;
        double angulo;
        double gravedad = 9.81;
        double altura;
        double alturaMaxima = 0;
        int segundoMaximo = 0;
        double anguloRadianes;

        System.out.println("SIMULACION DE TRAYECTORIA BALISTICA");
        System.out.println("----------------------------------------");

        System.out.print("Ingrese la velocidad inicial en m/s: ");
        velocidadInicial = sc.nextDouble();

        while (velocidadInicial <= 0) {

            System.out.println("ERROR: LA VELOCIDAD DEBE SER MAYOR A 0.");
            System.out.print("Ingrese nuevamente la velocidad inicial: ");
            velocidadInicial = sc.nextDouble();
        }

        System.out.print("Ingrese el angulo de lanzamiento en grados: ");
        angulo = sc.nextDouble();

        while (angulo <= 1 || angulo >= 89) {

            System.out.println("ERROR: EL ANGULO DEBE ESTAR ENTRE 1 Y 89 GRADOS.");
            System.out.print("Ingrese nuevamente el angulo: ");
            angulo = sc.nextDouble();
        }

        anguloRadianes = angulo * Math.PI / 180;

        System.out.println("\nTRAYECTORIA DEL PROYECTIL");
        System.out.println("----------------------------------------");

        for (int segundo = 1; segundo <= 10; segundo++) {

            altura = (velocidadInicial * Math.sin(anguloRadianes) * segundo)
                    - ((gravedad * segundo * segundo) / 2);

            if (altura < 0) {

                System.out.println("En el segundo " + segundo
                        + " la altura es negativa.");
                System.out.println("El proyectil ya impacto el suelo.");

                break;

            } else {

                System.out.println("Segundo " + segundo
                        + ": Altura = " + altura + " metros");

                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                    segundoMaximo = segundo;
                }
            }
        }

        if (segundoMaximo > 0) {
            System.out.println("La altura maxima fue alcanzada aproximadamente en el segundo "
                    + segundoMaximo);
        }

    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

