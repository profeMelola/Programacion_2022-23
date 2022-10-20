/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/UT03_Estructuras_Control/NUM_ALEATORIOS/CalculoMentalSuma/readme.md#ejercicio-1-calculomental
 */
package random;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado, operando1, operando2;
        int numOperaciones = 0;
        
        double aleatorio1, aleatorio2;
        do {
            aleatorio1 = Math.random();
            
            //System.out.println("aleatorio1: "+aleatorio1);
            aleatorio2 = Math.random();
            
            operando1 = (int) (aleatorio1 * 100 + 1);
            //System.out.println("operando1: "+operando1);
            
            operando2 = (int) (aleatorio2 * 100 + 1);
            //operando1 = (int) (Math.random() * 100 + 1); //sumo el 1 porque se excluye el 100
            //operando2 = (int) (Math.random() * 100 + 1);

            System.out.print(operando1 + " + " + operando2 + " = ");
            resultado = new Scanner(System.in).nextInt();
            numOperaciones++;
        } while (resultado == operando1 + operando2);

        System.out.println("Has conseguido realizar: " + (numOperaciones - 1)
                + " sumas consecutivas");
    }
}