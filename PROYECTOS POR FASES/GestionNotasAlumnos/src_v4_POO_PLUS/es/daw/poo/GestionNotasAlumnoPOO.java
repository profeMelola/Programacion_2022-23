package es.daw.poo;

import es.daw.model.Alumno;
import es.daw.util.Informes;
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

        // Por defecto inicializamos a 3 que es la opción de salir
        int opcion = 3;

        // EJECUTAR DIFERENTES MÉTODOS EN BASE A LA OPCIÓN DE MENÚ ELEGIDA
        do {
            // MOSTRAR EL MENÚ PRINCIPAL
            opcion = Utilidades.mostrarMenuPrincipal();

            switch (opcion) {
                case 1:
                    // CARGA DE DATOS DE ALUMNOS
                    Utilidades.cargarAlumnos();
                    break;
                case 2:
                    // MEJORA!!! PERLITA DE LUISMI
                    // Controlar previamente si el array de alumnos está vacío.
                    // En ese caso no saco el submenú de informes porque no hay información que mostrar
                    if (!Utilidades.siClaseVacia())
                        Informes.gestionarInformes();
                    break;
                case 3:
                    System.out.println("Vas a salir del pedazo programa de gestión de notas!");
                    break;
                default:
                    System.out.println("Profesor, te has equivocado eligiendo la opción!");
            }
        } while (opcion != 3);
    }
}
