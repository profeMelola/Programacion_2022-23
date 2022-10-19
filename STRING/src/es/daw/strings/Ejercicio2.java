/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/STRING#ejercicio-2-muestra-por-pantalla-cada-uno-de-los-caracteres-de-una-cadena-de-texto-en-l%C3%ADneas-separadas
 */
package es.daw.strings;

/**
 *
 * @author melol
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = "Java";
        
        //With for traditional
        for (int i = 0; i < txt.length(); i++) {
                System.out.println(txt.charAt(i));
        }
    }
    
}
