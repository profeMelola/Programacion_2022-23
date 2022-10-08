/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/UT03_Estructuras_Control/BUCLES/Bucles_Anidados/FacturasGastos/readme.md
 */
package es.daw.facturasgastos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class FacturasGastos {

    public static String EURO = "\u20ac";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numFacturas = 0;
        //sumatorio de todas del importe de todas las facturas
        float importeTotalFacturas = 0.0f;

        int numGastos = 0;
        //sumatorio del importe de todos los gastos
        float importeTotalGastos = 0.0f;

        System.out.println("** Indica el número de facturas que vas introducir:");
        Scanner sc = new Scanner(System.in);
        //sc.useLocale(Locale.US);

        numFacturas = sc.nextInt();

        // Primer bucle. Se ejecutará tantas veces como FACTURAS introduzca el usuario
        for (int indiceFacturas = 1; indiceFacturas <= numFacturas; indiceFacturas++) {

            //Por cada factura hay que preguntar por los gastos de dicha factura
            System.out.println("* Indica el número de gastos de la factura (" + indiceFacturas + ")");
            numGastos = sc.nextInt();

            //Segundo bucle. Se ejecutará tantas veces como GASTOS tenga la factura
            for (int indiceGastos = 1; indiceGastos <= numGastos; indiceGastos++) {
                System.out.println("\t Indica el importe del gasto (" + indiceGastos + ")");
                importeTotalGastos += sc.nextFloat();
            }
            //Una vez que acaba el segundo bucle muestro por pantalla el importe totat
            //de los gastos de una factura concreta.
            System.out.println("** Factura (" + indiceFacturas + "), total importe: " + importeTotalGastos);

            // Se realiza el sumatorio del importe total de las facturas
            //totalFacturas = totalFacturas + totalGastos;
            importeTotalFacturas += importeTotalGastos;
            importeTotalGastos = 0.0f;
        }

        //private String totalFacturas;
        System.out.println("*********************************************************");
        System.out.println("**** Importe total de todas las facturas: " + importeTotalFacturas);
        System.out.println("*********************************************************");

    }
    //Una vez que acaba el primer bucle muestro por pantalla el importe total de todas las facturas

}
