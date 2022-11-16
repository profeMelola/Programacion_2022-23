/*
 * Clase con todos los métodos estáticos relativos a informes
 */
package es.daw.util;

import es.daw.model.Alumno;
import static es.daw.poo.GestionNotasAlumnoPOO.CLASE;
import static es.daw.util.Utilidades.SC_NUM;
import static es.daw.util.Utilidades.calcularNotaMediaClase;

/**
 *
 * @author melol
 */
public class Informes {
    
    /**
     * Método que gestionar los informes del sistema de gestión de notas
     */
    public static void gestionarInformes(){
        int opt = 4;
        
        do{
            opt = mostrarMenuInformes();
            switch(opt){
                case 1:
                    mostrarNotaMediaAlumnos();
                    break;
                case 2:
                    // Ya no haría falta gestionar que la clase esté vacía porque se ha controlado
                    // en el menú principal
                    //if (!Utilidades.siClaseVacia())
                        System.out.printf("\t\tLa nota media de toda la CLASE es %d\n",calcularNotaMediaClase());
                    break;
                case 3:
                    mostrarInformacionClase();
                    break;
                case 4:
                    System.out.println("Vuelves al menú principal!\n");
                    break;
                default:
                    System.out.println("Elige una opción correcta del submenú");
            }
        }while(opt != 4);
    }
    
    /**
     * Método que muestra el menú específico de informes y devuelve la opción seleccionada
     * @return 
     */
    public static int mostrarMenuInformes(){
        System.out.println("");
        System.out.println("\t------------- INFORMES -------------------");
        System.out.println("\t1. Mostrar nota media de todos los alumnos");
        System.out.println("\t2. Mostrar nota media de toda la clase");
        System.out.println("\t3. Mostrar información de todos los alumnos");
        System.out.println("\t4. Volver al menú principal");
        System.out.println("\t------------------------------------------");
        
        int opcion = 4;
        
        if (SC_NUM.hasNextInt())
            opcion = SC_NUM.nextInt();
        
        //SC.nextLine(); 
        return opcion;

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
        //if (!Utilidades.siClaseVacia()){
            for(Alumno a: CLASE){
                //System.out.println("\tLa nota media del alumno "+a.getNombre()+" es:"+a.calcularNotaMedia());
                System.out.println("\tLa nota media del alumno "+a.getNombre()+
                        " es:"+a.getNotaMedia());
            }
        //}
        
    }
    
    
    /**
     * Método que muestra la información de cada alumnos de la clase
     * 
     */
    public static void mostrarInformacionClase(){
        //if (!Utilidades.siClaseVacia()){
            System.out.println("********* INFO DE TODOS LOS ALUMNOS ******");
            for(Alumno a: CLASE)
                System.out.println(a.toString());
            
            /*
            // PARA EXPLICAR EL ENCAPSULADO DEL ARRAY DE NOTAS DEL ALUMNO!!!!
            // Si no devuelvo una copia del array desde el getNotas, podré modificarlo
            // y no queremos que suceda            
            System.out.println("CAMBIANDO PRIMERA NOTA DEL ALUMNO 1");
            float[] notas = CLASE[0].getNotas();
            notas[0] = 100;
            */
            
        //}
    }    
}
