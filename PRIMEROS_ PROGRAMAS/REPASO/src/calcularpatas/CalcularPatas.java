/*
 https://github.com/profeMelola/Programacion_2022-23/tree/main/Primeros%20Programas/REPASO#ejercicio-8-calcularpatas
 */
package calcularpatas;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalcularPatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. DECLARACIÓN DE VARIABLES
        int numPatasHormigas, numPatasAraña, numPatasCochinillas, numTotalPatas;
        
        final int PATAS_HORMIGA = 6;
        final int PATAS_ARAÑA = 8;
        final int PATAS_COCHINILLA = 14;
        
        Scanner sc = new Scanner(System.in);
        
        //2. PETICIÓN DE DATOS E INICIALIZACIÓN DE VARIABLES
        System.out.println("Introduce el número de hormigas: ");
        numPatasHormigas = sc.nextInt() * PATAS_HORMIGA;
        
        System.out.println("Introduce el número de arañas: ");
        numPatasAraña = sc.nextInt() * PATAS_ARAÑA;
        
        System.out.println("Introduce el número de cochinillas: ");
        numPatasCochinillas = sc.nextInt() * PATAS_COCHINILLA;    
        
        
        numTotalPatas = numPatasHormigas + numPatasAraña + numPatasCochinillas;
        
        System.out.println("El número total de patas: "+numTotalPatas);
        
    }
    
}
