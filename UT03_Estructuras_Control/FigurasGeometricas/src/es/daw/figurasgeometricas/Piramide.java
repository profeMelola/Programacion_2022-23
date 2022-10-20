/*
 * https://manolohidalgo.com/ejercicio-bucles-dibuja-piramide/
 */
package es.daw.figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Piramide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de niveles que tendrá la pirámide: ");
        int numeroNiveles = scanner.nextInt();

        int numeroPosiciones = numeroNiveles * 2 - 1;
        int posInicial = numeroNiveles;
        int posFinal = numeroNiveles;

        // Primer bucle se va a ejecutar tantas veces como número de niveles (filas) indique el usuario
        for (int i = 0; i < numeroNiveles; i++) {
            String resultado = "";

            // El segundo bucle se va a ejecutar tantas veces como asteriscos (posiciones) necesite
            // en la base de la pirámide
            for (int j = 0; j <= numeroPosiciones; j++) {
                if ((j < posInicial) || (j > posFinal)) 
                    resultado += " ";
                else
                    resultado += "*";
                
            }
            System.out.println("["+i+"]"+resultado);
            posFinal++;
            posInicial--;
        }
    }

}
