package es.daw.poo;

import es.daw.model.Alumno;
import es.daw.util.Utilidades;


/**
 *
 * @author melola
 */
public class GestionNotasAlumnoPOO {
    
    // ARRAY CON ALUMNOS: LA CLASE
    // General para todo el programa
    public static Alumno[] CLASE;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 3; // Por defecto inicializamos a 3 que es la opción de salir
        
        // EJECUTAR DIFERENTES MÉTODOS EN BASE A LA OPCIÓN DE MENÚ ELEGIDA
        do {
            // MOSTRAR EL MENÚ
            opcion = Utilidades.mostrarMenu();
            
            switch(opcion){
                case 1:
                    // 1. CARGA DE DATOS DE ALUMNOS
                    // Colección de alumnos (array) ==> simula un clase
                    //alumnos = Utilidades.cargarAlumnos();
                    Utilidades.cargarAlumnos();
                    break;
                case 2: 
                    //2. MOSTRAR LA NOTA MEDIA DE CADA ALUMNO
                    //Utilidades.mostrarNotaMediaAlumnos(alumnos);
                    Utilidades.mostrarNotaMediaAlumnos();
                    break;
                case 3:
                    System.out.println("Vas a salir del pedazo programa de gestión de notas!");
                    break;
                default:
                    System.out.println("Profesor, te has equivocado eligiendo la opción!");
            }
        }while( opcion != 3 );

        // ESTO DEBEREMOS PASARLO A LA PARTE DE INFORMES... PENDIENTE!!!
        // 3. MOSTRAR INFO DE TODOS LOS ALUMNOS
        /*System.out.println("********* INFO DE TODOS LOS ALUMNOS ******");
        for(Alumno a: alumnos)
            System.out.println(a.toString());*/
    }
    
}