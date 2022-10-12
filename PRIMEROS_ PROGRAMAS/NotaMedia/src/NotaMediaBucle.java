/*
 * ENUNCIADO DEL EJERCICIO:
 
Escribe un programa que pregunte el nombre al alumno.

Después le preguntará la nota (que puede tener decimales) de los 6 módulos que está cursando:

"Qué nota tienes en el módulo 1?"

"Qué nota tienes en el módulo 2?"

..................

"Qué nota tienes en el módulo 6?"

Al finalizar le devolverá un mensaje en el que le indicará la nota media del curso (redondeando al entero inferior).

"Hola xxxxxx tu nota media en el curso es: "
 */
package notamedia;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class NotaMediaBucle {

    static final int NUM_MODULOS = 6;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        float sumatorioNotas = 0;
        float media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuál es tu nombre? ");
        nombre = sc.nextLine();
        
        for (int i = 1; i <= NUM_MODULOS; i++) {
            System.out.println("Qué nota tienes en el módulo "+i+" ?");
            sumatorioNotas = sc.nextFloat();
        }
        
        System.out.println("* El sumatorio de todas las notas es: "+sumatorioNotas);
        media = sumatorioNotas / NUM_MODULOS;
        
        System.out.println("Hola "+nombre+" ! tu nota media del curso es "+media);
        
        int notaFinal = (int)media; //porque en FP no hay nota final con decimales
        
        System.out.println("1. [TRUNCAR] Hola "+nombre+" ! tu nota media del curso es "+notaFinal); //truncar
        System.out.println("2. [ROUND] Hola "+nombre+" ! tu nota media del curso es "+Math.round(media)); //redondear
        System.out.println("3. [CEIL] Hola "+nombre+" ! tu nota media del curso es "+Math.ceil(media)); //redondear al entero superior
        System.out.println("4. [FLOOR] Hola "+nombre+" ! tu nota media del curso es "+Math.floor(media)); //truncar (parte entera, desprecio decimales)
        
        
    }
    
}
