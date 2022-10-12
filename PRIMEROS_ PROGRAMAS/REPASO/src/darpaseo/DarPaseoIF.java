/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/Primeros%20Programas/REPASO#ejercicio-5-darpaseo
 */
package darpaseo;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class DarPaseoIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean siLlueve;
        boolean finTareas;
        boolean irBiblioteca;
        
        boolean irPaseo = false;
        
        Scanner sc = new Scanner(System.in);

        // Preguntas al principo
        System.out.println("¿Está lloviendo?");
        siLlueve = sc.nextBoolean(); // true false
        
        System.out.println("¿Has terminado tus tareas?");
        finTareas = sc.nextBoolean(); // true false

        System.out.println("¿Tienes que ir a la biblio");
        irBiblioteca = sc.nextBoolean();

        //caso 1
        /*if (irBiblioteca){
            irPaseo = true;
        }else if (!siLlueve){
            if (finTareas)
                irPaseo = true;
        }*/
        
        //caso 2
        if (irBiblioteca){
            irPaseo = true;
        }else if (!siLlueve && finTareas){
            irPaseo = true;
        }
        
        //caso 3: no recomendable!!! no es necesario comparar con true y false!!!
        /*if (irBiblioteca == true){
            irPaseo = true;
        }else if (siLlueve != true && finTareas == true){
            irPaseo = true;
        }*/
        
        
        
        
        System.out.println("¿puedes salir? "+ irPaseo);
        
    }
    
}
