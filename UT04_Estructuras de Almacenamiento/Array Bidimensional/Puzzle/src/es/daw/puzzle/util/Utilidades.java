/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.daw.puzzle.util;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Utilidades {

    /**
     * devuelveTabla
     * @param palabras
     * @return 
     */
    public static char[][] devuelveTabla(String[] palabras) {
        
        // se supone que nos envían todas las palabras de la misma longitud
        int filas = palabras.length;
        int col = palabras[0].length();
        
        char[][] tabla = new char[filas][col];
        char[] palabraChar;

        for (int i = 0; i < filas; i++) {
            palabraChar = palabras[i].toCharArray();
            for (int j = 0; j < col; j++) {
                tabla[i][j] = palabraChar[j];
            }
        }
        return tabla;
    }

    /**
     * copiarTabla
     * @param tabla
     * @return 
     */
    public static char[][] copiarTabla(char[][] tabla) {
        char[][] copia = new char[tabla.length][tabla[0].length];
        
        /*
        for (int fila = 0; fila < tabla.length; fila++) {
            System.arraycopy(tabla[fila], 0, copia[fila], 0, tabla[0].length);
        }
        */

        
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[0].length; col++) {
                copia[fila][col] = tabla[fila][col];
            }
        }
        
        return copia;
    }

    /**
     * devuelveTablaModificada
     * @param tabla
     * @return 
     */
    public static char[][] devuelveTablaModificada(char[][] tabla) {

        // copiar tabla
        char[][] copia;
        copia = copiarTabla(tabla);
        
        Random rd = new Random();
        int r1;//= rd.nextInt(5);
        int r2; //= rd.nextInt(5);
        
        int filas = tabla.length;
        //int col = tabla[0].length;

        for (int i = 0; i < filas; i++) {
            do {
                r1 = rd.nextInt(filas); //en nuestro caso filas es 5
                r2 = rd.nextInt(filas);
            } while (r1 == r2);
            
            intercambiaPosiciones(copia, i, r1, r2);
        }
        return copia;

    }

    /**
     * compararTablas
     * @param tabla
     * @param copia
     * @return 
     */
    public static boolean compararTablas(char tabla[][], char copia[][]) {

        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[0].length; col++) {
                if (copia[fila][col] != tabla[fila][col]) {
                    return false;
                }
            }
        }
        return true;

    }

    /**
     * intercambiaPosiciones
     * @param tabla
     * @param col
     * @param pos1
     * @param pos2 
     */
    public static void intercambiaPosiciones(char tabla[][], int col, int pos1, int pos2) {
        char aux;
        aux = tabla[pos1][col];
        tabla[pos1][col] = tabla[pos2][col];
        tabla[pos2][col] = aux;
    }

    /**
     * mostrarTabla
     * @param tabla 
     */
    public static void mostrarTabla(char[][] tabla) {
        System.out.println("  1 2 3 4 5");
        /*
        System.out.println("""
                             ---------
                           """); //text block a partir de jdk 15
        */
        System.out.println("  ---------\n");
        
        for (int fila = 0; fila < tabla.length; fila++) {
            System.out.print((fila + 1) + "|");
            for (int col = 0; col < tabla[0].length; col++) {
                System.out.print(" " + tabla[fila][col]);
            }
            System.out.println("\n");
        }
    }

    /**
     * pedirPosiciones
     * @param max1
     * @param max2
     * @return 
     */
    public static int[] pedirPosiciones(int max1, int max2) {
        Scanner sc = new Scanner(System.in);
        int[] posiciones = new int[3];
        
        /*
         * array para guardar en:
         * [0]: posición columna
         * [1]: posición primera fila
         * [2]: posición segunda fila
         *
        */
        //Puzzle.posicionColumna = XXX; //Si hubiéramos utilizado la opción de variables staticas globales en vez del array de 3 enteros
        
        do {
            System.out.println("Introduce la columna que quieres cambiar ");
            posiciones[0] = sc.nextInt() - 1;
            //posiciones[0] = posiciones[0] - 1;
        } while ( posiciones[0] <0 || posiciones[0] >= max1);
        do {
            System.out.println("Introduce la primera posición  que quieres intercambiar ");
            posiciones[1] = sc.nextInt() - 1;
            //posiciones[1] = posiciones[1] - 1;
        } while (posiciones[1] <0 ||  posiciones[1] >= max2);
        do {
            System.out.println("Introduce la segunda  posición  que quieres intercambiar ");
            posiciones[2] = sc.nextInt() - 1;
            //posiciones[2] = posiciones[2] - 1;
        } while (posiciones[2] <0 || posiciones[2] >= max2);

        return posiciones;
    }
}
