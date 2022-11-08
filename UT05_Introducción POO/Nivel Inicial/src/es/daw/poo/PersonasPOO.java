/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT05_Introducci%C3%B3n%20POO/Nivel%20Inicial
 */
package es.daw.poo;

import es.daw.poo.model.Persona;

/**
 *
 * @author melola
 */
public class PersonasPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //pruebaPOO1(); //v1 (todo público, constructor por defecto)
        //v2
        Persona p1 = new Persona("5555555F", "Pepe", "López Vega", 28);
        Persona p2 = new Persona("5555555F", "Ana", "López Vega", 14);
               
        Persona p3 = new Persona("8888888V");

        p3.setNombre("Rodrigo");
        p3.setApellidos("Encabo");
        p3.setEdad(18);

        System.out.println("Persona 1:" + p1.toString());
        System.out.println("Persona 2:" + p2.toString());
        System.out.println("Persona 3:" + p3);

    }

    public static void pruebaPOO1() {
        // Aquí voy a instanciar objetos persona
        /*Persona persona1 = new Persona();
        
        persona1.nombre = "Pepe";
        persona1.apellidos = "López Vega";
        persona1.dni = "55555F";
        persona1.edad = 28;
        
        System.out.println("La persona "+persona1.nombre+" "+persona1.apellidos+" "
                + "con dni "+persona1.dni+" es mayor de edad? "+(persona1.edad > 18));
        
        
        Persona persona2 = new Persona();
        
        persona2.nombre = "Ana";
        persona2.apellidos = "López Vega";
        persona2.dni = "55555F";
        persona2.edad = 14;
        
        System.out.println("La persona "+persona2.nombre+" "+persona2.apellidos+" "
                + "con dni "+persona2.dni+" es mayor de edad? "+(persona2.edad > 18));
         */
    }

}
