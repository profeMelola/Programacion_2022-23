/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/NUM_ALEATORIOS#ejercicio-2-aleatoriosrango
 */
package random;

/**
 *
 * @author melol
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5 números aleatorios entre 10 y 20: ");
        numerosAleatorios(5, 10, 20);
        System.out.println("7 números aleatorios entre 1 y 50: ");
        numerosAleatorios(7, 1, 50);

    }

    static void numerosAleatorios(int cuantos, int min, int max) {
        for (int i = 1; i <= cuantos; i++) {
            int n = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(n + "  ");
        }
        System.out.println("");
    }
}
