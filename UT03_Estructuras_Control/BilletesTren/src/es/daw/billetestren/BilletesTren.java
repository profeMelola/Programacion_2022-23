/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BilletesTren#escribir-el-programa-que-tenga-en-cuenta-las-siguientes-especificaciones
 
Escribir el programa que tenga en cuenta las siguientes especificaciones

Precio del billete: 2 euros

Se aplican descuentos por edades:

Menor de 8 años: gratis
Entre 8 y 17 años: se aplica el 50% de descuento
Entre 18 y 64 años: no hay descuento
Mayor de 64 años (a partir de 65): gratis
Debe mostrar por consola el precio final del billete.

 */
package es.daw.billetestren;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class BilletesTren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando variables
        final int precioBillete = 2;
        int edad = 0;
        int precioFinalBillete = 0;

        Scanner sc = new Scanner(System.in);

        //Pedir la edad al usuario
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        //Comprobando condiciones para aplicar precio final al billete
        if (edad < 8) {
            precioFinalBillete = 0;
        } else if (edad >= 8 && edad <= 17) {
            precioFinalBillete = precioBillete / 2;
        } else if (edad >= 18 && edad <= 64) {
            precioFinalBillete = precioBillete;
        } else if (edad > 64) {
            precioFinalBillete = 0;
        }
        System.out.println("El precio final de tu billete es: " + precioFinalBillete);

    }

}
