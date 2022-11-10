package es.daw.util;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Utilidades {
    
    public static final int NUM_NOTAS = 6;
    
    /**
     * Método que pide las notas de un alumno
     * @param sc
     * @param numNotas
     * @return 
     */
    public static float[] obtenerNotas(Scanner sc, int numNotas){
        
        float[] notas = new float[numNotas];
        
        for (int i = 0; i < numNotas; i++) {
            System.out.println("* Introduce la nota <"+(i+1)+"> :");
            if (sc.hasNextFloat())
                notas[i] = sc.nextFloat();
        }
        
        return notas;
        
    }
    
}
