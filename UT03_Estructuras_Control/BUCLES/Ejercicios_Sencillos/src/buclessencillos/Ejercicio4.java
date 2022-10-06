/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/Ejercicios_Sencillos#ejercicio-4
 */
package buclessencillos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio4 {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número mayor a 1: ");
        int numero = input.nextInt();
        int numero2 = numero;
        
        // Líneas distintas
        System.out.println("*** en líneas distintas *****");
        do{
            System.out.println(numero);
            numero--;
            
        }while(numero >= 1);
        
        
        //misma línea
        System.out.println("*** en la misma línea *****");
        do{
            System.out.print(numero2+" ");
            numero2--;
        }while(numero2 >=1);
        
        System.out.println("\nCHIMPÚM!!!!!!");
        
        
        
        
    }
    
    
}
