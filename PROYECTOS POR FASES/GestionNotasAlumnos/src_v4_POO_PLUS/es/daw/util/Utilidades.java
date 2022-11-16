package es.daw.util;

import es.daw.model.Alumno;
import java.util.Scanner;
import javax.swing.JOptionPane;

// Importamos únicamente el array estático de alumnos
import static es.daw.poo.GestionNotasAlumnoPOO.CLASE;

/**
 *
 * @author melola
 */
public class Utilidades {

    // Ahora sobra la constante NUM_NOTAS porque obtengo 
    //la longitud del length de MODULOS
    //public static final int NUM_NOTAS = 6;
    public static final Scanner SC_NUM = new Scanner(System.in);
    public static final Scanner SC_TEXTO = new Scanner(System.in);
    
    public static final String[] MODULOS = {"Programación","LM","SI","Entornos","BD","FOL"};
    
    public static final String AVISO = "[AVISO] No hay ningún alumno dado de alta en el sistema\n";
    
    /**
     * Método que pide las notas de un alumno
     * @return
     */
    public static float[] obtenerNotas() {

        //la referencia a notas no es visible fuera del método 
        //y así para el resto del código deja existir en el momento de la salida del método.
        float[] notas = new float[MODULOS.length];

        for (int i = 0; i < MODULOS.length; i++) {
            //System.out.println("* Introduce la nota <" + (i + 1) + "> :");
            System.out.println("* Introduce la nota del módulo "+MODULOS[i]+" :");
            if (SC_NUM.hasNextFloat()) {
                notas[i] = SC_NUM.nextFloat();
            }
        }

        return notas;

    }

    /**
     * Método que carga en el array CLASE todos los alumnos correctamente.
     */
    public static void  cargarAlumnos() {
        
        // Variables para guardar info necesaria por cada alumno
        String nombre, NIA;

        // ----------------------------------------------
        // Pedimos al profesor que indique el número de alumnos
        /*
        // Opción 1: al estilo clásico con Scanner
        System.out.println("* Introduce el número de alumnos: ");
        int numAlumnos = SC_NUM.nextInt();
        sc.nextLine();*/

        // Opción 2: con JOptionPane
        String numAlumnosS = JOptionPane.showInputDialog("Introduce el número de alumnos");
        int numAlumnos = Integer.parseInt(numAlumnosS);
        // ----------------------------------------------
        
        // Con el número de alumnos declaramos el tamaño del array de objetos Alumno (la clase)
        CLASE = new Alumno[numAlumnos];
        
        // Por cada alumno pedimos la información necesaria para crear el objeto de cada alumno en cuestión
        for (int i = 0; i < numAlumnos; i++) {
            // Nombre
            System.out.println("\tIntroduce el nombre del alumno <" + (i + 1) + ">:");
            nombre = SC_TEXTO.nextLine();

            // NIA
            System.out.println("\tIntroduce el NIA del alumno <" + (i + 1) + ">:");
            NIA = SC_TEXTO.nextLine();

            //Con los datos anteriores creo el objeto alumno
            CLASE[i] = new Alumno(nombre, NIA);

            // Pido las notas 
            CLASE[i].setNotas(obtenerNotas());
            
            //SC.nextLine(); // para que el SC se pare a leer el siguiente dato... TRUQUI!!!

        }
        
    }
    
    /**
     * Método que calcula la nota media de todos los alumnos 
     */
    public static void calcularNotaMediaAlumnos(){
        if (!siClaseVacia()){
            for(Alumno a: CLASE){
                a.calcularNotaMedia();
            }
        }
        
    }
    
    /**
     * Método que calcula la nota media obtenida por toda la clase
     * @return 
     */
    public static int calcularNotaMediaClase(){
        int sumatorioNotasMedias = 0;
        
        if (!Utilidades.siClaseVacia()){
            
            for(Alumno a: CLASE){
                sumatorioNotasMedias += a.getNotaMedia();
            }
            
            //Hago cast a float del resultado de la división para no perder los decimales
            //porque dividir dos enteros siempre va a dar un entero truncado y no un decimal.
            //Por ejemplo las notas medias de 7 y 4 de dos alumnos suman 11 y dividido entre dos daría 5,5
            //Pues si no hago el cast a float daría 5
            return Math.round((float)sumatorioNotasMedias/CLASE.length);
        }
        
        return 1; //Si no hay alumnos dados de alta en el sistema
        
    }
    

    /**
     * Método que muestra por pantalla el primer menú (sin informes)
     * Devuelve la opción elegida por el usuario
     * @return 
     */
    public static int mostrarMenuPrincipal(){
        
        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 4 plus ******************");
        System.out.println("* 1. Cargar datos de los alumnos");
        System.out.println("* 2. INFORMES");
        System.out.println("* 3. Salir");
        System.out.println("-------------------------------------");

        int opcion = 3;
        
        if (SC_NUM.hasNextInt())
            opcion = SC_NUM.nextInt();
        
        //SC.nextLine(); 
        return opcion;
        
    }
    
    /**
     * Método que comprueba si el array de alumnos (clase) está vacía
     * @return 
     */
    public static boolean siClaseVacia(){
        
        if (CLASE == null){
            System.out.println(AVISO);
            return true;
        }
        
        return false;

    }

    


}