/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/FUNCIONES/readme.md#ejercicio-1-esprimo
 */
package es.daw.funciones;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        do{
            System.out.println("Escribe un número entero para saber si es primo ( 0 para salir ): ");
            num = sc.nextInt();
            if (esPrimo(num))
                System.out.println("El número "+num+" es primo");
            else{
                if (num > 0)
                    System.out.println("El número "+num+" no es primo");
            }
            
        }while(num > 0);
        
        System.out.println("El programa ha terminado!");
        
    }
    
    /**
     * 
     * @param num
     * @return 
     */
    private static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;
        
        //el número 1 no es primo
        if (num < 2)
            primo = false;
        
        // Por defecto si el número es 1 ó 2 son primos y no entra en el bucle
        /*
            Lo que vamos a hacer es recorrer todos los números entre el 2 y el número sobre el que queremos saber si es primo o no. 
            Dentro del bucle comprobaremos el principio del número primo. «Divisible por si mismo y la unidad». 
            Es decir, que si encontramos un número que es divisible por el número evaluado, este dejará de ser primo.
        */
        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }    
}
