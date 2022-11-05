/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/RETOS/readme.md#reto-6-adivina-palabra-reto6java
 */
package es.daw.adivinapalabra;

/*import es.daw.adivinapalabra.util.Utilidades;
import es.daw.adivinapalabra.util.Utilidades2;*/
import es.daw.adivinapalabra.util.*;
import java.util.Arrays;

/**
 *
 * @author melol
 */
public class Reto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. Pedimos las palabras
        //String[] palabras = Utilidades.pedirPalabras();
        String[] palabras = Utilidades2.pedirPalabras();
        
        System.out.println("Array devuelto:" +Arrays.toString(palabras));
        
        //2. Creamos la palabra nueva
        //String nuevaPalabra = Utilidades.creaPalabraNueva(palabras);
        
        String nuevaPalabra = Utilidades2.generarPalabraSecreta(palabras);
        
        System.out.println("nuevaPalabra: "+nuevaPalabra);
        
        
        //3. Gestionamos que el usuario adivine la palabra nueva
        //Utilidades.adivinarPalabra(nuevaPalabra);
        Utilidades2.adivinarPalabra(nuevaPalabra);
        
        // FIN!!!
        System.out.println("*** Has adivinado la palabra. Cerrando el programa ***");
        
        
    }
    
}
