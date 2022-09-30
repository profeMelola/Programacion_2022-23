/*
 https://github.com/profeMelola/Programacion_2022-23/tree/main/Primeros%20Programas/REPASO
 */
package calculocapital;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalculoCapital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double capital;
        double ganancia;
        //final double PORCENTAJE_MENSUAL = 0.02;
        final float PORCENTAJE_MENSUAL = 0.02f;
        //final float PORCENTAJE_MENSUAL = (float)0.02;
        System.out.println(PORCENTAJE_MENSUAL);
        
        System.out.println("Introduce el capital invertido:");
        capital = sc.nextDouble();
        
        ganancia = capital * PORCENTAJE_MENSUAL;
        
        System.out.println("La ganancia en un mes es: "+ganancia);
        
        
    }
    
}
