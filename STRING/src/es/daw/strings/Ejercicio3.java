/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/STRING#ejercicio-3-muestra-un-texto-invertido
 */
package es.daw.strings;

/**
 *
 * @author melola
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena = "James Gosling creó Java";
        
        // FORMA PRO
        //StringBuilder pepe = new StringBuilder(cadena);
        //System.out.println("[FORMA AUTOMÁTICA] "+pepe.reverse());
        
        
        // FORMA ARTESANAL
        String cadenaResultado = "";
        for (int i= cadena.length()-1; i>=0; i--  ){
            cadenaResultado += cadena.charAt(i);
        }
        
        System.out.println("AL REVÉS: "+cadenaResultado);
    }
    
}
