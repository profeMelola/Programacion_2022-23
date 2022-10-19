package es.daw.strings;

/**
 *
 * @author melola
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1 = "hola";
        String cadena2 = "adios";
        String cadena3 = "Hola";
        
        System.out.println("hola es igual a Hola? "+cadena1.equals(cadena3));
        System.out.println("hola es igual a Hola? "+cadena1.equalsIgnoreCase(cadena3));
        System.out.println("hola es igual a adios? "+cadena1.equalsIgnoreCase(cadena2));
    }
    
}
