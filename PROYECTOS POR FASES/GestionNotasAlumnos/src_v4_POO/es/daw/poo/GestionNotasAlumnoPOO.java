package es.daw.poo;

import es.daw.model.Alumno;
import es.daw.util.Utilidades;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class GestionNotasAlumnoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("*********** PROGRAMA GESTIÓN DE NOTAS : VERSIÓN 4 ******************");
        System.out.println("* Introduce el número de alumnos: ");
        int numAlumnos = sc.nextInt();
        sc.nextLine();
        
        // Controlar que el número de alumnos sea mayor que cero...

        // Colección de alumnos (array) ==> simula un clase
        Alumno[] alumnos = new Alumno[numAlumnos];
        //Alumno a;
        String nombre, NIA;
        
        // 1. CARGA DE DATOS DE ALUMNOS
        for (int i = 0; i < numAlumnos; i++) {
            // Nombre
            System.out.println("\tIntroduce el nombre del alumno <" + (i + 1) + ">:");
            //String nombre = sc.nextLine();
            nombre = sc.nextLine();
            
            // NIA
            System.out.println("\tIntroduce el NIA del alumno <" + (i + 1) + ">:");
            //String NIA = sc.next();
            NIA = sc.next();
            
            
            //Con los datos anteriores creo el objeto alumno
            //Alumno alumno = new Alumno(nombre, NIA);
            //alumno.setNotas(Utilidades.obtenerNotas(sc, NUM_NOTAS));
            //alumnos[i] = alumno;
            
            alumnos[i] = new Alumno(nombre, NIA);
            
            // Pido las notas 
            alumnos[i].setNotas(Utilidades.obtenerNotas(sc, Utilidades.NUM_NOTAS));
            
            sc.nextLine(); // para que el SC se pare a leer el siguiente dato... TRUQUI!!!
            
        }   
        
        
        //2. MOSTRAR LA NOTA MEDIA DE CADA ALUMNO
        /*
        Alumno a;
        for (int i = 0; i < alumnos.length; i++) {
            a = alumnos[i];
            System.out.println("\tLa nota media del alumno "+a.getNombre()+" es:"+a.calcularNotaMedia());
        }
        */
        
        for(Alumno a: alumnos)
            System.out.println("\tLa nota media del alumno "+a.getNombre()+" es:"+a.calcularNotaMedia());
        
        // 3. MOSTRAR INFO DE TODOS LOS ALUMNOS
        System.out.println("********* INFO DE TODOS LOS ALUMNOS ******");
        for(Alumno a: alumnos)
            System.out.println(a.toString());
    }
    
}
