package es.daw.pasapalabra.util;

/**
 *
 * @author melola
 */
public class Utilidades {
    
    /**
     * Método que pinta las letras por consola
     * @param letras 
     */
    public static void pintarLetras(String[] letras) {
        for (String letra : letras) {
            System.out.print(" [ " + letra + " ] ");
        }
        System.out.println("");
    }

    /**
     * Método que comprueba si la palabra es acertada
     * @param palabra
     * @param palabras
     * @param indice
     * @return 
     */
    public static boolean aceptarPalabra(String palabra, String[] palabras, int indice) {
        return palabra.equalsIgnoreCase(palabras[indice]);
    }
    
    /**
     * Se calcula la puntuación obtenida, cada acierto vale 2 puntos, cada error resta 1 punto.
     * Si el jugador completa el panel y  finaliza en la primera ronda tiene un extra de 30 puntos, 
     * si finaliza el panel  en la segunda 15 y en la tercera 5. 
     * Si no se ha podido finalizar  no hay puntos extra, solo el cálculo de aciertos y errores.
     *
     * @param aciertos
     * @param errores
     * @param ronda
     * @return
     */
    public static int calcularPuntuacion(int aciertos, int errores, int ronda) {
        int resultado;
        int extra = 0;

        switch (ronda) {
            case 1:
                extra = 30;
                break;
            case 2:
                extra = 15;
                break;
            case 3:
                extra = 5;
                break;

        }
        
        resultado = (aciertos * 2) - errores + extra;
        
        return resultado;

    }
    
}
