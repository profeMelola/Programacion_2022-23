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

    // Ahora sobra la constante NUM_NOTAS porque obtengo la longitud del length de MODULOS
    //public static final int NUM_NOTAS = 6;
    public static final Scanner SC = new Scanner(System.in);
    
    public static final String[] MODULOS = {"Programación","LM","SI","Entornos","BD","FOL"};
    
    /**
     * Método que pide las notas de un alumno
     * @return
     */
    public static float[] obtenerNotas() {

        float[] notas = new float[MODULOS.length];

        for (int i = 0; i < MODULOS.length; i++) {
            //System.out.println("* Introduce la nota <" + (i + 1) + "> :");
            System.out.println("* Introduce la nota del módulo "+MODULOS[i]+" :");
            if (SC.hasNextFloat()) {
                notas[i] = SC.nextFloat();
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
        int numAlumnos = sc.nextInt();
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
            //String nombre = sc.nextLine();
            nombre = SC.nextLine();

            // NIA
            System.out.println("\tIntroduce el NIA del alumno <" + (i + 1) + ">:");
            //String NIA = sc.next();
            NIA = SC.next();

            //Con los datos anteriores creo el objeto alumno
            //Alumno alumno = new Alumno(nombre, NIA);
            //alumno.setNotas(Utilidades.obtenerNotas(sc, NUM_NOTAS));
            //alumnos[i] = alumno;
            CLASE[i] = new Alumno(nombre, NIA);

            // Pido las notas 
            CLASE[i].setNotas(obtenerNotas());

            SC.nextLine(); // para que el SC se pare a leer el siguiente dato... TRUQUI!!!

        }
        
    }
    

    /**
     * Método que muestra la nota media de todos los alumnos
     */
    public static void mostrarNotaMediaAlumnos(){
        /*
        // Primera forma: bucle tradicional
        Alumno a;
        for (int i = 0; i < alumnos.length; i++) {
            a = alumnos[i];
            System.out.println("\tLa nota media del alumno "+a.getNombre()+" es:"+a.calcularNotaMedia());
        }
        */
        
        // Segunda forma: con un for ... each
        for(Alumno a: CLASE)
            System.out.println("\tLa nota media del alumno "+a.getNombre()+" es:"+a.calcularNotaMedia());
        
    }
    

    /**
     * Método que muestra por pantalla el primer menú (sin informes)
     * Devuelve la opción elegida por el usuario
     * @return 
     */
    public static int mostrarMenu(){
        /*
        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 4 plus ******************");
        System.out.println("* 1. Cargar datos de los alumnos");
        System.out.println("* 2. INFORMES");
        System.out.println("* 3. Salir");
        System.out.println("-------------------------------------");*/

        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 4 plus ******************");
        System.out.println("* 1. Cargar datos de los alumnos");
        System.out.println("* 2. Mostrar nota media de los alumnos");
        System.out.println("* 3. Salir");
        System.out.println("-------------------------------------");

        int opcion = 3;
        
        if (SC.hasNextInt())
            opcion = SC.nextInt();
        
        SC.nextLine(); 
        return opcion;
        
    }

}