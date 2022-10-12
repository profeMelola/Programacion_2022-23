/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.billetestren;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class BilletesTrenElisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int PRECIO_BILLETE = 2;
        int precioFinalBillete;
        int contBillete = 0;
        int numeroBilletes = 0;

        //VARIABLES LIMITE DE OPERACIONES
        int limite = 0;
        int contLimite = 0;

        // SUMATORIO IMPORTE TOTAL
        int importeTotal = 0;

        // SUMATORIO TOTAL RECAUDADO
        int totalRecaudado = 0;

        Scanner sc = new Scanner(System.in);

        //NUMERO DE OPERACIONES DEL PROGRAMA
        System.out.println("cuantas veces quieres ejecutar el programa?");
        limite = sc.nextInt();

        do {

            System.out.println("BIENVENIDO A LA MAQUINA DE BILLETE DE TREN");
            contLimite++;
            System.out.println("operación número " + contLimite);

            //NUMERO DE BILLETES QUE QUIERE COMPRAR EL USUARIO
            System.out.println("dime el numero de billetes que quieres comprar");
            numeroBilletes = sc.nextInt();
            contBillete = 0;
            importeTotal = 0;

            do {

                System.out.println("dime cual es tu edad");
                int edad = sc.nextInt();
                contBillete++;

                if (contBillete == 5) {
                    System.out.println("Tu billete es gratis!!");
                } else {

                    if (edad < 8) {
                        precioFinalBillete = PRECIO_BILLETE * 0;
                        System.out.println("enhorabuena!!! tu billete es gratis!!! El precio a pagar es " + precioFinalBillete + " euros!!");
                        importeTotal += precioFinalBillete;

                    } else if (edad >= 8 && edad <= 17) {
                        precioFinalBillete = PRECIO_BILLETE / 2;
                        System.out.println("enhorabuena!!! tienes en 50% de descuento, El precio a pagar por tu billete es " + precioFinalBillete + " euro");
                        importeTotal += precioFinalBillete;

                    } else if (edad >= 18 && edad <= 64) {
                        precioFinalBillete = PRECIO_BILLETE;
                        System.out.println("El precio a pagar de tu billete es " + precioFinalBillete + " euros.");
                        importeTotal += precioFinalBillete;

                    } else if (edad > 64) {
                        System.out.println("enhorabuena!!! tu billete es gratis");
                    }

                }

            } while (contBillete != numeroBilletes);

            System.out.println("*************IMPORTE TOTAL A PAGAR: ***********");
            System.out.println(importeTotal + "€");
            totalRecaudado += importeTotal;

        } while (contLimite != limite);
        System.out.println("FIN DEL PROGRAMA\nEL IMPORTE TOTAL RECAUDADO ES DE: \n" + totalRecaudado + " €");

    }

}
