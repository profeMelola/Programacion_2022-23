/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/RETOS/readme.md#reto-5
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorA;
        int valorB;
        int valorC; //variable auxilar
        
        // Solicitud de datos al usuario
        System.out.println("Este programa pide dos valores e intercambia el valor entre ambas variables.");
        System.out.print("Introduce el valor A: ");
        valorA = scanner.nextInt();
        System.out.print("Introduce el valor B: ");
        valorB = scanner.nextInt();

        // Realizamos Cálculos 
        valorC = valorA;
        valorA = valorB;
        valorB = valorC;
        
        //valorA = valorB; // MUY MAL!!!!!
        
        // Mostramos en pantalla
        System.out.println("Tras el cambio, valor A= " + valorA + " y valor B = " + valorB);

    }
}
