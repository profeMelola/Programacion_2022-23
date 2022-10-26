package es.daw.util;

/**
 *
 * @author melola
 */
public class Utilidades {
    
    /**
     * Método estático que pinta el menú de la calculadora por consola
     */
    public static void pintaMenu(){
        //Imprimimos por consola el menú
        System.out.println("\n"); //Este caracter especial nos permite imprimir una línea en blanco
        System.out.println("***** MENÚ DE LA CALCULADORA *****");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto de la división (operador %)");
        System.out.println("0. Salir del programa");
        System.out.println("--------------------------------------");
        System.out.print("Introduzca una opción válida: ");
    }
    
}
