/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/Primeros%20Programas/REPASO#ejercicio-5-darpaseo
 */
package darpaseo;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class DarPaseo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean siLlueve;
        boolean finTareas;
        boolean irBiblioteca;
        
        boolean irPaseo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Está lloviendo?");
        siLlueve = sc.nextBoolean(); // true false
        
        System.out.println("¿Has terminado tus tareas?");
        finTareas = sc.nextBoolean(); // true false
        
        System.out.println("De momento ¿puedes salir? "+ (!siLlueve && finTareas));
        
        System.out.println("¿Tienes que ir a la biblio");
        irBiblioteca = sc.nextBoolean();
        
        irPaseo = (!siLlueve && finTareas) || irBiblioteca;
        
        System.out.println("¿puedes salir finalmente? "+irPaseo);
        
        
                
        
        
        
        
    }
    
}
