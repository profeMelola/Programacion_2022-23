/*
Copia la clase Main del enunciado 2 porque vamos a modificarla incluyendo una estructura de repetición.
Modifica el programa para que termine exclusivamente cuando el usuario escriba la letra Q (de "quit", salir o abandonar ).
*/
package mayminnum;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class MayMinNumBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //char caracter;
        char caracter = 0;
                
        Scanner sc = new Scanner(System.in);

        
        // El caracter Q es 81 en la tabla ACII
        
        //boolean salir = false; // con flag
        
        //while (!salir){
        while (caracter != 81){
            
            System.out.println("* Escribe un caracter (min o may  o num): ");

            caracter = sc.next().charAt(0);
            
            /*if (caracter == 81) {
                salir = true;
                System.out.println("Has decidido salir del programa!");
            }
            else*/ if (caracter >= 65 && caracter <=90 )
                System.out.println("Has introducido una letra en mayúsculas\n");
            else if (caracter >=97 && caracter <=122)
                System.out.println("Has introducido una letra en minúsculas\n");
            else if (caracter >= 48 && caracter <= 57)
                System.out.println("Has introducido un número\n");
            else
                System.out.println("torpedo! no has introducido ni may ni min ni un número!!!!");
            
            
        }
        
        if (caracter == 81)
            System.out.println("Has decidido salir del programa!");
    }
    
}
