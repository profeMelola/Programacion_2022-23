/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/EstadisticaEdades#enunciado-datos-estad%C3%ADsticos-edades-alumnos
 */
package estadisticaedades;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class EstadisticaEdades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. DECLARACIÓN DE VARIABLES
        Scanner sc = new Scanner(System.in);
        
        int sumaEdades = 0;
        int contadorAlumnos = 0, contadorMayorEdad = 0;
        double media;
        int edad = 0;
        
        // 2. MEJOR DO ... WHILE!!!!
        do {
            System.out.println("* Introduzca la edad: ");
            edad = sc.nextInt();
            
            if (edad >= 0 ){
                sumaEdades += edad;
                contadorAlumnos++;
                if (edad >= 18) contadorMayorEdad++;
            }
        }while(edad >= 0);
        
        //si no paso a double, será siempre int aunque de decimal
        media = sumaEdades / contadorAlumnos; 
        
        System.out.println("Media entera: "+media);
        media = (double) sumaEdades / contadorAlumnos; //si no paso a double, será siempre int aunque de decimal
        System.out.println("Media decimal: "+media);
        
        System.out.println("* Suma de todas las edades: "+ sumaEdades);
        System.out.println("* Media: "+media);
        
        // ------------------
        String nombre= "Mari Luz";
        System.out.println("Hola "+nombre); //clásica RnR
        System.out.printf("Hola %s tu edad es %d\n",nombre,47);
        // ------------------
        
        System.out.printf("* Media (con dos decimales): %.2f\n", media);
        System.out.println("* Número total de alumnos: "+contadorAlumnos);
        System.out.println("* Número de alumnos mayores de edad: "+contadorMayorEdad);
    }
}
