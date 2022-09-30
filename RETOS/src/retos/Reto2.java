/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/RETOS/retos.md#reto-2
 * Pedir 3 números y mostrarlos ordenados de mayor a menor. No se puede usar colecciones de datos.
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b, c;

      System.out.print("Introduzca primer número: ");
      a = sc.nextInt();
      System.out.print("Introduzca segundo número: ");
      b = sc.nextInt();
      System.out.print("Introduzca tercer número: ");
      c = sc.nextInt();

      if (a > b && b > c) {
         System.out.println(a + ", " + b + ", " + c);
      } else if (a > c && c > b) {
         System.out.println(a + ", " + c + ", " + b);
      } else if (b > a && a > c) {
         System.out.println(b + ", " + a + ", " + c);
      } else if (b > c && c > a) {
         System.out.println(b + ", " + c + ", " + a);
      } else if (c > a && a > b) {
         System.out.println(c + ", " + a + ", " + b);
      } else if (c > b && b > a) {
         System.out.println(c + ", " + b + ", " + a);
      }        
        
    }
    
}
