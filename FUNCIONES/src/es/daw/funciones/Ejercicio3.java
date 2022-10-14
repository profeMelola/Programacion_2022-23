/*
 * https://github.com/profeMelola/Programacion_2022-23/edit/main/FUNCIONES/readme.md#ejercicio-3-calculasegundos
 */
package es.daw.funciones;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica el número de días: ");
        int dias = sc.nextInt();
        
        System.out.println("Indica el número de horas: ");
        int horas = sc.nextInt();
        
        System.out.println("Indica el número de minutos:");
        int minutos = sc.nextInt();
        
        
        //----------------------------
        // Realizar la llamada a la función
        int segundos = obtenerSegundos(dias,horas,minutos);
        
        //------------------------
        
        System.out.println("Total de segundos: "+segundos);
        
    }
    
    
    private static int obtenerSegundos(int dias, int horas, int minutos){
        
        // por partes
        horas += dias *24;
        minutos += horas * 60;
        int segundos = minutos * 60;
        
        return segundos;
        
        //return (dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60);
        
    }
    
}
