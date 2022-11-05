/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.ejerciciosarrays;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de numeros");
        int qty = sc.nextInt();

        int unArray[] = new int[qty];

        for (int i = 0; i < unArray.length; i++) {
            System.out.println("Introduce el num " + (i + 1));
            int num1 = sc.nextInt();

            unArray[i] = num1;
        }
        
        for (int i = unArray.length - 1; i >= 0; i--) {
            System.out.println(unArray[i]);
        }
        
        for (int i = unArray.length; i > 0; i--) {
            System.out.println(unArray[i - 1]);
        }

    }

}
