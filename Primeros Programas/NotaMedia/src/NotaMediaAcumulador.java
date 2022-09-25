/*
 * ENUNCIADO DEL EJERCICIO:
 
Escribe un programa que pregunte el nombre al alumno.
Después le preguntará la nota (que puede tener decimales) de los 6 módulos que está cursando:
"Qué nota tienes en el módulo 1?"
"Qué nota tienes en el módulo 2?"
..................
"Qué nota tienes en el módulo 6?"
Al finalizar le devolverá un mensaje en el que le indicará la nota media del curso (truncar).
"Hola xxxxxx tu nota media en el curso es: "
 */

package notamedia;

import java.util.Scanner;


/**
 *
 * @author melola
 */
public class NotaMediaAcumulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        
        float sumatorioNotas, media;
        
        //final int NUM_NOTAS = 6;
        
        int contador = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuál es tu nombre? ");
        nombre = sc.nextLine();
        
        System.out.println("Qué nota tienes en el módulo 1?");
        sumatorioNotas = sc.nextFloat();
        //contador = contador + 1;
        contador++;
        
        System.out.println("Qué nota tienes en el módulo 2?");
        //sumatorioNotas = sumatorioNotas + sc.nextFloat();
        sumatorioNotas += sc.nextFloat();
        contador++;
        
        System.out.println("Qué nota tienes en el módulo 3?");
        sumatorioNotas += sc.nextFloat();
        contador++;
        
        System.out.println("Qué nota tienes en el módulo 4?");
        sumatorioNotas += sc.nextFloat();
        contador++;
        
        System.out.println("Qué nota tienes en el módulo 5?");
        sumatorioNotas += sc.nextFloat();
        contador++;
        
        System.out.println("Qué nota tienes en el módulo 6?");
        sumatorioNotas += sc.nextFloat();
        contador++;
        
        
        System.out.println("* El sumatorio de todas las notas es: "+sumatorioNotas);
        media = sumatorioNotas / contador;
        
        
        
        System.out.println("Hola "+nombre+" ! tu nota media del curso es "+media);
        
        
        int notaFinal = (int)media;
        
        //System.out.println("Hola "+nombre+" ! tu nota media del curso es "+(int)media);
        System.out.println("1. [TRUNCAR] Hola "+nombre+" ! tu nota media del curso es "+notaFinal); //truncar0
        
        System.out.println("2. [ROUND] Hola "+nombre+" ! tu nota media del curso es "+Math.round(media));
        System.out.println("3. [CEIL] Hola "+nombre+" ! tu nota media del curso es "+Math.ceil(media));
        System.out.println("4. [FLOOR] Hola "+nombre+" ! tu nota media del curso es "+Math.floor(media));
        
        
        
        
        
    }
    
}