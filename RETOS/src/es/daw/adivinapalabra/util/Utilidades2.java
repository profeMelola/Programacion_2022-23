package es.daw.adivinapalabra.util;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Utilidades2 {

    public static final int NUM_PALABRAS = 5;
    static Scanner sc = new Scanner(System.in);    
    
    public static String[] pedirPalabras(){
        
        String[] palabras = new String[NUM_PALABRAS];
        
        for (int i = 0; i < NUM_PALABRAS; i++) {
            System.out.println("Escribe una palabra:");
            palabras[i] = sc.next();
        }
        
        /*
        //MAL!!! devuelve una posición de memoria
        System.out.println(palabras); 
        
        // Método que pinta por pantalla cada elemento del array en una línea
        pintaArray(palabras);
        
        // Forma de obtener un array con todos sus elementos convertidos a un String
        System.out.println(Arrays.toString(palabras));
        */
        
        return palabras;
        
    }
    
    public static String generarPalabraSecreta(String[] palabras){
        
        String nuevaPalabra = "";
        //String nuevaPalabra; //mal!!!! hay que inicializarla para poder concatenar
        
        for (int i = 0; i < palabras.length; i++) {
            //nuevaPalabra = nuevaPalabra + palabras[i].charAt(0);
            nuevaPalabra += palabras[i].charAt(0);
        }
        
        return nuevaPalabra;
        
    }
    
    
    
    /**
     * Para poder pintar los elementos de un array tengo que recorrerlo
     * @param palabras 
     */
    public static void pintaArray(String[] palabras){
        for (String palabra: palabras) {
            System.out.println(palabra);
        }
        
    }
    
    public static void adivinarPalabra(String palabraSecreta){
        
        /*do{
            System.out.println("¿Cuál es la palabra secreta?");
        }while(!palabraSecreta.equalsIgnoreCase(sc.next()));*/
        
        String nuevaPalabra="";
        
        do{
            System.out.println("¿Cuál es la palabra secreta?");
            nuevaPalabra = sc.next();
        }while(!nuevaPalabra.equalsIgnoreCase(palabraSecreta));
        
    }
    
}
