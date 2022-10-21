/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/PROYECTOS%20POR%20FASES/GestionNotasAlumnos#versi%C3%B3n-1
 */
package es.daw.gestionnotasalumnos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Version2 {

    private final static int NUM_MODULOS = 6;
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 1 ******************");
        System.out.println("1. Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();
        
        int notaMedia = calcularNotaMedia();
        
        System.out.println("------------------------");
        System.out.printf("El alumno %s ha obtenido una nota media de %d\n",nombre, notaMedia);
        
    }
    
    /**
     * calcularNotaMedia
     * @return 
     */
    private static int calcularNotaMedia(){
        System.out.println("2. Introduce las notas de los módulos: ");
        float sumatorioNotas = 0;
        
        for (int i=0; i < NUM_MODULOS; i++ ){
            System.out.println("\t Nota del módulo <"+(i+1)+">");
            sumatorioNotas += sc.nextFloat();
        }
        
        System.out.println("(traza) nota media: "+(sumatorioNotas / NUM_MODULOS));
        //no puedo hacer el cast porque no sería el redondeo estándar, sería un truncado
        //return (int) (sumatorioNotas / NUM_MODULOS); 
        return Math.round(sumatorioNotas/ NUM_MODULOS);
        
    }
    
}
