/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/NUM_ALEATORIOS#ejercicio-2-aleatoriosrango
 */
package random;

import java.util.Random;

/**
 *
 * @author melol
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println("5 números aleatorios entre 10 y 20: ");
        //numerosAleatorios(5, 10, 20);
        
        //System.out.println("7 números aleatorios entre 1 y 50: ");
        //numerosAleatorios(7, 1, 50);
        
        numerosAleatorios2(5, 10, 20);

    }

    /**
     * Usando Math.random
     * @param cuantos
     * @param min
     * @param max 
     */
    static void numerosAleatorios(int cuantos, int min, int max) {
        for (int i = 1; i <= cuantos; i++) {
            // Si no sumo 1 no se incluye ni el mínimo ni el máximo
            int n = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(n + "  ");
        }
        System.out.println("");
    }
    
    /**
     * Usando la clase Random
     * @param cuantos
     * @param min
     * @param max 
     */
    static void numerosAleatorios2(int cuantos, int min, int max) {
        
        Random aleatorio = new Random();
        System.out.println("aleatorio: "+aleatorio.nextInt());
        
        /*Random aleatorio2 = new Random(666);
        Random aleatorio3 = new Random(666);
        
        System.out.println("aleatorio2: "+aleatorio2.nextInt());
        System.out.println("aleatorio3: "+aleatorio3.nextInt());*/
        
        /*for (int i=0; i< 20; i++){
            System.out.println(aleatorio.nextInt(10));
        }*/
            
        for (int i = 1; i <= cuantos; i++) {
            int n = aleatorio.nextInt( ( max - min) + 1) + min;
            System.out.print(n + "  ");
        }

        
    }
}
