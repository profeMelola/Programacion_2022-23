/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/RETOS/retos.md#reto-1
 * Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por teclado, 
 * que estará comprendido entre 0 y 99999
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        int num = sc.nextInt();
        
        if (num >= 0 && num <=99999){
        
            if (num < 10) {
                System.out.println("Tiene 1 cifra");
            } else if (num < 100) {
                System.out.println("Tiene 2 cifras");
            } else if (num < 1000) {
                System.out.println("Tiene 3 cifras");
            } else if (num < 10000) {
                System.out.println("Tiene 4 cifras");
            } else if (num < 100000) {
                System.out.println("Tiene 5 cifras");
            }
        }else
            System.out.println("Has introducido un número incorrecto");
    }

}
