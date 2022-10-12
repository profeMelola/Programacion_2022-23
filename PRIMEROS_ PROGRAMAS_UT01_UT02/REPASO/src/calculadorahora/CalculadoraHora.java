/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/Primeros%20Programas/REPASO#ejercicio-6-calculadorahora
 */
package calculadorahora;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalculadoraHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int segundosTotal, hora, minutos, segundos;

        System.out.println("*** Conversor de hora, introduce los segundos ***");
        System.out.println("Solo es posible calcular horas inferiores a 1 día");
        System.out.println("Total segundos inferior a 86399");
        System.out.println("\nIntroduce los segundos:");
        segundosTotal = sc.nextInt();
        
        if (segundosTotal <= 86399) {
        //if (segundosTotal <= 86399) {

            hora = segundosTotal / (60 * 60);
            segundosTotal = segundosTotal % (60 * 60);

            minutos = segundosTotal / 60;
            segundos = segundosTotal % 60;

            System.out.println(hora+ ": "+minutos +" : "+segundos );
            
        }
        else
            System.out.println("no es posible hacer el cálculo con esa hora");

    }        
        
    
    
}
