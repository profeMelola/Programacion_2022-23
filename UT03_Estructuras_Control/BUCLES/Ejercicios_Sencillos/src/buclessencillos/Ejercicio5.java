/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/Ejercicios_Sencillos#ejercicio-5
 */
package buclessencillos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("* Introduce un número mayor:");
        int mayor = input.nextInt();
        
        System.out.println("* Introduce un número menor:");
        int menor = input.nextInt();
        
        if (menor > mayor)
            System.out.println("Datos incorrectos!!!!");
        else{
            for(int i = mayor; i>= menor; i--)
                System.out.println(i);
        }
        
    }
    
}
