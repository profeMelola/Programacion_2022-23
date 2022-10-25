/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/FUNCIONES/readme.md#ejercicio-4-calcularcuotas
 */
package es.daw.funciones;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cuota;
        int mensualidades;
        
        
        // Inicio del programa, explicación al usuario
        System.out.println("El programa calcula la cuota correspondiente al pago mensual "
                + "y el total a pagar al final de la financiación  por la compra de un producto.");
        
        // Pedimos datos al usuario
        System.out.print("Introduce la primera cuota a pagar: ");
        cuota = scanner.nextDouble();
        System.out.print("Introduce el número de meses de financiación: ");
        mensualidades = scanner.nextInt();

        // Mostramos el resultado
        //System.out.println("Total pagado por el producto: " + calcularImporte(cuota,mensualidades));
        System.out.printf("Total pagado por el producto: %.2f \n", calcularImporte(cuota,mensualidades));
    }
    
    /**
     * calcularImporte
     * @param cuota
     * @param mensualidades
     * @return 
     */
    public static double calcularImporte(double cuota2, int mensualidades2){
        double totalPagado = 0;
        for (int i = 1; i <= mensualidades2; i++) {
            //System.out.println("Cuota <" + i + "> : " + cuota);
            System.out.printf("Cuota <%d> : %.2f\n",i,cuota2);
            totalPagado += cuota2;
            cuota2 *= 1.25;
            //cuota = cuota + cuota*0.25;
        }
        return totalPagado;
    }

}
