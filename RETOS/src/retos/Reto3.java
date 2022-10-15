/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/RETOS#reto-3
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. DECLARACIÓN DE VARIABLES
        // contador de num veces aparece el 3
        int contadorDe3 = 0; 
        // contador de num veces aparece el 2
        int contadorDe2 = 0; 
        // sumatorio de todos los números
        int sumatorio = 0; 
        // contador para saber cuántas veces sale un num consecutivo
        int consecutivo = 0; 
        
        int numero = 0; // número introducido por el usuario
        //variable auxiliar para guardar el valor introducido por el usuario y
        //compararlo con el siguiente valor
        int valorAnterior = 1; 
        
        Scanner sc = new Scanner(System.in);
        
        
        do{
            valorAnterior = numero;
            
            System.out.println("* Escribe un valor entero: ");
            numero = sc.nextInt();
            
            // siempre sumo
            sumatorio+=numero;

            //controlar contador de 2 y contador de 3
            if (numero == 2)
                contadorDe2++;
            else if (numero == 3)
                contadorDe3++;
            
            // controlar consecutivos
            if (valorAnterior == numero)
                consecutivo++;
            else
                consecutivo = 1;
            
            
            System.out.println("consecutivo: "+consecutivo);
            System.out.println("contadorDe3: "+contadorDe3);
            System.out.println("contadorDe2: "+contadorDe2);
            System.out.println("sumatorio:"+sumatorio);
            
        }while( !(contadorDe3 == 3 || contadorDe2 == 2 || sumatorio > 100 || consecutivo == 8) );
        
    }
    
}
