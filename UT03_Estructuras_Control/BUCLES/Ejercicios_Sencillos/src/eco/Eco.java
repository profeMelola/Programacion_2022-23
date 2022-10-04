/*
 *https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/Ejercicios_Sencillos
Programa que muestre un mensaje repetido por consola tantas veces como se hay introducido por teclado.

Hazlo de tres formas:

    con bucle for.
    con bucle while.
    con bucle do..while.

Saca tus propias conclusiones:

    ¿Se puede hacer con los tres tipos de bucles?
    ¿Qué tipo de bucle es más adecuado cuando sabes el número exacto de repetidiciones?

 */
package eco;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Eco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje = "Hola alumnos!";
        //int numVeces = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántas veces quieres que salga el mensaje?");
        int numVeces = sc.nextInt();

        // MAL
        /*System.out.println(mensaje);
        System.out.println(mensaje);
        System.out.println(mensaje);
        System.out.println(mensaje);
        System.out.println(mensaje);*/
        
        // ---------------------
        // 1. BUCLE FOR
        // ---------------------
        /*
        for ( int cont=1; cont<=numVeces; cont++){
            System.out.println("["+cont+"] "+mensaje);
        }
        */
        /*
        for ( int cont=0; cont<numVeces; cont++){
            System.out.println("["+cont+"] "+mensaje);
        }*/
        
        // ---------------------
        // 2. WHILE
        // ---------------------
        /*int cont = 0;
        while(cont < numVeces){
            System.out.println("["+cont+"] "+mensaje);
            cont++;
        }*/
        /*int cont = 1;
        while(cont <= numVeces){
            System.out.println("["+cont+"] "+mensaje);
            cont++;
            //cont = cont + 1;
        }*/
        
        // ---------------------
        // 2. DO WHILE
        // ---------------------        
        int cont = 0;
        do{
            if ( numVeces > 0)
                System.out.println("["+cont+"] "+mensaje);
            cont++;
        }while(cont < numVeces);

    }

}
