/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/RETOS/readme.md#reto-6
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int digito1;
        int digito2;
        int inverso;
        
        // Solicitud de datos al usuario
        System.out.println("Este programa calcula el número inverso a uno dado de dos cifras.");
        System.out.print("Introduce el valor del número: ");
        numero = scanner.nextInt();
        
        // Realizamos Cálculos 
        digito1 = numero / 10;
        System.out.println("digito1: "+digito1);
        digito2 = numero % 10;
        inverso = digito2 * 10 + digito1;
        
        // Mostramos en pantalla
        System.out.println("El numero inverso es " + inverso);

    }
}
