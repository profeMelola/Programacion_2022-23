/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/UT03_Estructuras_Control/CONDICIONALES/CalificacionAlumno/readme.md
 * 
 * Añadido al programa que se ejecuta de forma repetida hasta
 * que el usuario escriba 0
 */
package calificacionalumno;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalificacionAlumnoWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int nota = 1;
        
        while(nota != 0){
            
            // ------------------------------------------------------
            System.out.println("* Escribe la nota del alumno (0 para terminar): ");
            nota = sc.nextInt();

            if ( nota >= 1 && nota <= 4){
                System.out.println("Has sacado un insuficiente!!!");
            }else if (nota == 5){
                System.out.println("Has sacado un sufi!!!");
            }else if (nota == 6){
                System.out.println("Has sacado un bien!!");
            //}else if (nota == 7 || nota == 8){
            }else if ( nota > 6 && nota < 9){
                System.out.println("Has sacado un notable!!");
            }else if ( nota >= 9 && nota <=10){
                System.out.println("Eres un campeón, has sacado un sobresaliente!!!!");
            }else{
                System.out.println("Te has confundido al meter la nota!!!");
            }
            // ------------------------------------------------------
        }
        if (nota == 0)
            System.out.println("El programa va a terminar.....");
        
    }
    
}
