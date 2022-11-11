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
        
        Alumno[] alumnos = new Alumno[Utilidades.numeroAlumnos];
        
        int opcion = 3;
        // EJECUTAR DIFERENTES MÉTODOS EN BASE A LA OPCIÓN DE MENÚ ELEGIDA
        do {
            // MOSTRAR EL MENÚ
            opcion = Utilidades.mostrarMenu();
            
            switch(opcion){
                case 1:
                    // 1. CARGA DE DATOS DE ALUMNOS
                    // Colección de alumnos (array) ==> simula un clase
                    alumnos = Utilidades.cargarAlumnos();
                    break;
                case 2: 
                    //2. MOSTRAR LA NOTA MEDIA DE CADA ALUMNO
                    Utilidades.mostrarNotaMediaAlumnos(alumnos);
                    break;
                case 3:
                    System.out.println("Vas a salir del pedazo programa de gestión de notas!");
                    break;
                default:
                    System.out.println("Profesor, te has equivocado eligiendo la opción!");
            }
        }while(opcion < 1 || opcion > 3 );
        
        
        
        
        
        // 3. MOSTRAR INFO DE TODOS LOS ALUMNOS
        /*System.out.println("********* INFO DE TODOS LOS ALUMNOS ******");
        for(Alumno a: alumnos)
            System.out.println(a.toString());*/
    }
    
}
