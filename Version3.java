/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/PROYECTOS%20POR%20FASES/GestionNotasAlumnos#versi%C3%B3n-1
 */
package es.daw.gestionnotasalumnos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Version3 {

    private final static int NUM_MODULOS = 6;
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 3 ******************");
        System.out.println("1. Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();
        
        //int notaMedia = calcularNotaMedia();
        
        int notaMedia = calcularNotaMediaArray();
        
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
    
    
    private static int calcularNotaMediaArray(){
        
        //------------------------------------------------------
        // DIFERENTES FORMAS DE DECLARAR E INICIALIZAR UN ARRAY
        //------------------------------------------------------
        
        //float notas[] = new float[6];
        float[] notas= new float[NUM_MODULOS];
        
        
        //float[] notas = {4.5f , 5 , 6 , 8.9f , 4 , 7.3f }; 
        
        //float[] notas;
        //notas = {4.5f,5,6,8.9f,4,7.3f}; // no te deja!!!!
        
//        notas[0] = 4.5f;
//        notas[1] = 5;
//        //notas[2] = 6;
//        notas[3] = 8.9f;
//        notas[4] = 4;
//        notas[5] = 7.3f; //para mostrar el valor por defecto

        //----------------------
        // 2 FORMAS DE RECORRER Y PINTAR CONTENIDO DE UN ARRAY
        //forma tradicional
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        
        // for each
        for(float nota: notas)
            System.out.println(nota);
        //-------------------------
        
        
        System.out.println("2. Introduce las notas de los módulos: ");
        float sumatorioNotas = 0;
        
        for (int i=0; i < NUM_MODULOS; i++ ){
            System.out.println("\t Nota del módulo <"+(i+1)+">");
            //sumatorioNotas += sc.nextFloat();
            notas[i] = sc.nextFloat();
        }
        
        //for (int i=0; i < notas.length; i++)
        //    sumatorioNotas += notas[i];
        
        System.out.println("sumatorio con for each!!!!");
        for(float nota: notas)
            sumatorioNotas += nota;
        
        
        System.out.println("(traza) nota media: "+(sumatorioNotas / NUM_MODULOS));
        //no puedo hacer el cast porque no sería el redondeo estándar, sería un truncado
        //return (int) (sumatorioNotas / NUM_MODULOS); 
        return Math.round(sumatorioNotas/ NUM_MODULOS);
        
        
    }
}
