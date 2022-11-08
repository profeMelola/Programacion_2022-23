/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/PROYECTOS%20POR%20FASES/GestionNotasAlumnos#versi%C3%B3n-4-array-de-notas--clase-alumno--array-de-alumnos
 */
package es.daw.poo;

import java.util.Scanner;
import model.Alumno;

/**
 *
 * @author melola
 */
public class gestionnotasalumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 4 ******************");
        System.out.println("* Introduce el número de alumnos: ");
        int numAlumnos = sc.nextInt();

        // Colección de alumnos (array)
        Alumno[] alumnos = new Alumno[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            // Nombre
            System.out.println("\tIntroduce el nombre del alumno <" + (i + 1) + ">:");
            String nombre = sc.nextLine();
            sc.nextLine();
            
            //pendiente pedir el NIA
            
            //Alumno alumno = new Alumno();
            
        }
        
        
    }
    
}
