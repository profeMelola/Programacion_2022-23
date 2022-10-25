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

        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 2 ******************");
        System.out.println("* Introduce el número de alumnos: ");
        int numAlumnos = sc.nextInt();

        //Creo estas variables fuera del bucle para que no se cree una por cada repetición
        String nombre = ""; //en esta variable guardo el nombre del alumno cada vez
        int notaMedia = 0; //en esta variable guardo la nota media de cada alumno

        int sumatorioNotasMedias = 0;

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("\tIntroduce el nombre del alumno <" + (i + 1) + ">:");
            nombre = sc.nextLine();
            sc.nextLine();

            notaMedia = calcularNotaMedia();

            sumatorioNotasMedias += notaMedia;

            System.out.printf("\tEl alumno %s ha obtenido una nota media de %d\n", nombre, notaMedia);
            System.out.println("....................");
        }

        int notaMediaFinal = sumatorioNotasMedias / numAlumnos;
        System.out.printf("La nota media final de la case es %d.\n El nivel es %s.", notaMediaFinal, calcularNivel(notaMediaFinal));

    }

    /**
     * Calcula la nota media de un alumno calcularNotaMedia
     *
     * @return
     */
    private static int calcularNotaMedia() {
        System.out.println("2. Introduce las notas de los módulos: ");
        float sumatorioNotas = 0;

        for (int i = 0; i < NUM_MODULOS; i++) {
            System.out.println("\t Nota del módulo <" + (i + 1) + ">");
            sumatorioNotas += sc.nextFloat();
        }

        System.out.println("(traza) nota media: " + (sumatorioNotas / NUM_MODULOS));
        //no puedo hacer el cast porque no sería el redondeo estándar, sería un truncado
        //return (int) (sumatorioNotas / NUM_MODULOS); 
        return Math.round(sumatorioNotas / NUM_MODULOS);

    }

    /**
     * Función o método estático que calcula el nivel de la clase devolviendo:
     * alto/medio/bajo
     *
     * @return
     */
    private static String calcularNivel(int nota) {
        String nivel = "";
        if (nota < 5) {
            nivel = "bajo";
        } else if (nota >= 5 && nota < 7) {
            nivel = "medio";
        } else {
            nivel = "alto";
        }

        return nivel;

    }

}
