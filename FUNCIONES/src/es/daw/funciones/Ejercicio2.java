/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/FUNCIONES/readme.md#ejercicio-2-divisoresprimos
 * Escribir una función que se le pase un número entero y devuelva el número de divisores primos que tiene.
 */
package es.daw.funciones;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Ejercicio2 {

    static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;
        
        //el número 1 no es primo
        if (num < 2)
            primo = false;

        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }

    /**
     * numDivisoresPrimos
     * @param num
     * @return 
     */
    static int numDivisoresPrimos(int num) {
        int cont = 0;

        //for (int i = 1; i <= num; i++) {
        for (int i = 2; i <= num; i++) {
            
            /*if (esPrimo(i) && num % i == 0) {
                System.out.println("Divisor primo: "+i);
                cont++;
            }*/
            if (esPrimo(i)){
                if (num % i == 0){
                    System.out.println("Divisor primo: "+i);
                    cont++;
                }
            }
        }
        return (cont);
    }

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        do{
            System.out.println("\n* Escribe un número entero para calcular el número de divisores primos ( 0 para parar ): ");
            num = sc.nextInt();
            System.out.println("El número de divisores primos de "+num+" es:"+numDivisoresPrimos(num));
        }while ( num > 0);
        
        
    }

}
