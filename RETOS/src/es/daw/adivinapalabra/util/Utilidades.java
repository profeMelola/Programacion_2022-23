package es.daw.adivinapalabra.util;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Utilidades {
    
    public final static int NUM_PALABRAS = 5;
    private static final Scanner sc = new Scanner(System.in);
    
    /**
     * 
     * @return 
     */
    public static String[] pedirPalabras(){
        
        String[] palabras = new String[NUM_PALABRAS];
        
        for(int i=0; i < NUM_PALABRAS; i++){
            System.out.println("* Escribe una palabra:");
            palabras[i] = sc.next();
        }
        
        return palabras;
    }
    
    /**
     * 
     * @param palabras
     * @return 
     */
    public static String creaPalabraNueva(String[] palabras){
        String palabraNueva = "";
        
        for (String palabra: palabras){
            palabraNueva += palabra.charAt(0);
        }
        
        return palabraNueva;
    }
    
    public static void adivinarPalabra(String palabraAdivinar){
        String palabra="";
        do{
            System.out.println("¿Cuál es la palabra nueva?");
            palabra = sc.next();
        }while(!palabra.equalsIgnoreCase(palabraAdivinar));
    }
}
