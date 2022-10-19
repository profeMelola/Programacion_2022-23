/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/STRING#ejercicio-4-elimina-los-espacios-en-blanco-de-un-texto
 */
package es.daw.strings;

/**
 *
 * @author melola
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String txt = "Java mola mucho";
        
        String txtRdo = "";
        
        // Forma artesanal
        for(int i=0; i < txt.length(); i++){
            if ( txt.charAt(i) != ' ')
                txtRdo += txt.charAt(i);
        }
        
        System.out.println("[1- tradicional] CADENA SIN ESPACIOS: "+txtRdo);
        
        // Con funciones de String
        System.out.println("[2 - replace] CADENA SIN ESPACIOS: "+txt.replace(" "," "));
        
        System.out.println("[3 - replaceAll] CADENA SIN ESPACIOS: "+txt.replaceAll("\\s", ""));
        
        
        
    }
    
}
