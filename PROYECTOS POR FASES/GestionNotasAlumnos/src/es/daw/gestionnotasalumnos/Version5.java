/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/PROYECTOS%20POR%20FASES/GestionNotasAlumnos#versi%C3%B3n-5-con-arrays-multidimensionales
 */
package es.daw.gestionnotasalumnos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Version5 {

    
    static String[] nombresAlumnos;
    static final String[] MODULOS = {"PR","LM","BD","SI","EN","FOL"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        // Previamente está todo el cisco del Scanner y demás pidiendo el número de alumnos
        int numAlumnos = 4;
        int numModulos = 6;
        
        // ------------------------------------------------
        // TRABAJANDO CON 4 ALUMNOS Y 6 NOTAS CADA ALUMNO
        // ------------------------------------------------
        
        // Alumno 1
        float[] notas1 = {4.5f, 5, 7, 8.3f, 10, 5};
        // Alumno 2
        float[] notas2 = {3 , 5, 6.7f, 9, 2, 3.4f};
        // Alumno 3
        float[] notas3 = {9 , 5, 6.7f, 9, 3, 5.4f};
        // Alumno 4
        float[] notas4 = new float[numModulos];
        notas4[0] = 5;
        notas4[1] = 6;
        notas4[2] = 7.5f;
        notas4[3] = 5.8f;
        notas4[4] = 3;
        notas4[5] = 9;
        
        // ----------------------------
        // primero las filas y luego las columnas
        // las filas == alumnos
        // las columnas ==  notas
        
        // 1. INICIALIZACIÓN CELDA A CELDA
        float[][] notasClase1 = new float[numAlumnos][numModulos]; 
        
        // notas del Alumno1
        notasClase1[0][0] = 4.5f;
        notasClase1[0][1] = 5;
        notasClase1[0][2] = 7;
        notasClase1[0][3] = 8.3f;
        notasClase1[0][4] = 10;
        notasClase1[0][5] = 5;
        
        // notas del Alumno2
        notasClase1[1][0] = 3;
        notasClase1[1][1] = 5;
        notasClase1[1][2] = 6.7f;
        notasClase1[1][3] = 9;
        notasClase1[1][4] = 2;
        notasClase1[1][5] = 3.4f;
        
        // notas del Alumno3
        notasClase1[2][4] = 3;
        
        // notas del Alumno4
        
        //pendiente rellenar el resto de celdas....
        
        // -----------------------------
        //2.  INICIALIZACIÓN FILA A FILA
        float[][] notasClase2 ={{4.5f, 5, 7, 8.3f, 10, 5},
            {3 , 5, 6.7f, 9, 2, 3.4f},
            {9 , 5, 6.7f, 9, 3, 5.4f},
            {1,1,1,1,1,1}};
        
        float[][] notasClase3 ={notas1,notas2,notas3,notas4};
        
        float[][] notasClase4 ={notas1,{3 , 5, 6.7f, 9, 2, 3.4f},notas3,notas4};
        
        float[][] notasClase5 = new float[4][6];
        notasClase5[0] = notas1;
        notasClase5[1] = notas2;
        notasClase5[2] = notas3;
        notasClase5[3] = notas4;
        
        // -------------
        // DAMOS POR HECHO QUE EL PROFESOR HA INDICADO QUE VA A TRABAJAR CON 4 ALUMNOS
        nombresAlumnos = new String[numAlumnos]; //4 es el número de alumnos y el número de filas de la matriz
        nombresAlumnos[0] = "Pepe";
        nombresAlumnos[1] = "Ana";
        nombresAlumnos[2] = "María";
        nombresAlumnos[3] = "Carlos";
        // ---------------
        
        // 
        System.out.println("Pinto filas de la matriz:");
        pintaFilasMatriz(notasClase5);
        System.out.println("Pinto matriz:");
        pintaMatriz(notasClase5);
        
        System.out.println("Pinto notas de todos los alumnos por módulos:");
        pintaColumna(notasClase5,2);
        System.out.println("-----");
        pintaColumna(notasClase5,0);
        */
        
        // ---------- PARA LOS ALUMNOS COMPLETAR !!!---------
        // Crear un método para rellenar la matriz de notas en base al número de alumnos que indique el usuario
        // Usad un método
        // Luego llamad a los métodos para pintar la matriz de las diferentes formas ya implementadas
        
        //1. CARGAR NOTAS DE ALUMOS DE DOS FORMAS
        //1.1. Alumno a alumno todas las notas
        float[][] notasAlumno6 = cargarNotasByAlumno();
        //float[][] notasAlumno6 = cargarNotasByModulo();
        
        pintaMatriz(notasAlumno6);
        
        pintaFilasMatriz(notasAlumno6);
        
        // pinta la columna 2 (LM)
        pintaColumna(notasAlumno6,1);
        
        
        
        
        

    }
    
    /**
     * 
     * @param matriz
     * @param nombres 
     */
    private static void pintaFilasMatriz(float[][] matriz){
        
        // Recorremos el número de filas
        for (int i = 0; i < matriz.length; i++) {
            //System.out.println(matriz[i]); //sale dir memoria
            System.out.println("Notas del alumno "+nombresAlumnos[i]);
            System.out.println(Arrays.toString(matriz[i]));
        }
        
    }
    
    /**
     * pintar celda a celda
     * @param matriz 
     */
    private static void pintaMatriz(float[][] matriz){
        // bucle para recorrer las filas 
        for (int i = 0; i < matriz.length; i++) {
            // bucle para recorrer las columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
            
        }
    }
    
    /**
     * 
     * @param matriz
     * @param col  es la posición del módulo en el array de MODULOS y en la columna de la matriz
     */
    private static void pintaColumna(float[][] matriz, int col){
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Alumno "+nombresAlumnos[i]+ " ha sacado en "+MODULOS[col]+" un <"+matriz[i][col]+">");
        }
        
    }
    
    /**
     * Cargar notas por alumno (fila a fila)
     * 
     */
    private static float[][] cargarNotasByAlumno(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vas a cargar las notas completas de cada alumno!!");
        System.out.println("¿De cuántos alumnos vas a introducir notas?");
        int numAlumnos = sc.nextInt();
        sc.nextLine();
        
        // Una vez que se el número de alumnos tengo que declarar:
        // - La matriz con su número de filas
        // - El array de nombres con tu tamaño (nombres de los alumnos)
        
        float[][] matriz  = new float[numAlumnos][MODULOS.length];
        nombresAlumnos = new String[numAlumnos];
    
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce el nombre del alumno <"+(i+1)+">:");
            nombresAlumnos[i] = sc.nextLine();
            
            System.out.println("\tAhora vas a introducir las notas de "+nombresAlumnos[i]);
            
            for (int j = 0; j < matriz[i].length; j++) {
            //for (int j = 0; j < MODULOS.length; j++) {
                System.out.println("\tIntroduce la nota de "+MODULOS[j]);
                matriz[i][j] = sc.nextFloat();
            }
            
            sc.nextLine();
        }
        
        return matriz;
    }
    
    /**
     * Cargar notas por modulo (columna a columna)
     * 
     */    
    private static float[][] cargarNotasByModulo(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vas a cargar las notas de todos alumnos por módulo!!");
        System.out.println("¿De cuántos alumnos vas a introducir notas?");
        int numAlumnos = sc.nextInt();
        sc.nextLine();

        // Una vez que se el número de alumnos tengo que declarar:
        // - La matriz con su número de filas
        // - El array de nombres con tu tamaño (nombres de los alumnos)
        
        float[][] matriz  = new float[numAlumnos][MODULOS.length];
        nombresAlumnos = new String[numAlumnos];

        // Una vez que se el número de alumnos, cargo el array con todos los nombres
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduce el nombre del alumno <"+(i+1)+">");
            nombresAlumnos[i] = sc.nextLine();
        }
        
        
        // aquí i es columna 
        // y j es fila
        for (int i = 0; i < MODULOS.length; i++) {
            System.out.println("Vas a introducir las notas del modulo "+MODULOS[i]);
            for (int j = 0; j < matriz.length; j++) {
                //System.out.println("\tIntroduce la nota del alumno <"+(j+1)+">");
                System.out.println("\tIntroduce la nota del alumno "+nombresAlumnos[j]);
                matriz[j][i] = sc.nextFloat();
            }
            sc.nextLine();
        }
        
        return matriz;
    }
    
}
