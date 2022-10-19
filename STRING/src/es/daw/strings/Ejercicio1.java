/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/STRING#ejercicio-1-muestra-la-longitud-de-un-texto
 */
package es.daw.strings;

/**
 *
 * @author melola
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String txt ="JAVA";
        
        System.out.println("[FORMA 1: con función length] Longitud del texto: "+txt.length());
        
        //Forma artesanal
        int contador = 0;
        for (int i=0; i<txt.length();i++)
            contador++;
        
        System.out.println("[FORMA 2: forma artesanal] Longitud del texto: "+contador);
        
    }
    
}
