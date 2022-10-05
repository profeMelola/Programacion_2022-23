/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/CONDICIONALES/If_else_anidados#ejercicio-2-c%C3%A1lculo-del-d%C3%ADa-de-la-semana
 */
package calculodiasemana;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalculoDiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int dia;
        
        System.out.println("Dame un número entre 1 y 7:");
        dia = sc.nextInt();
        
        /*
        // FORMA 1 CON IF ELSE ANIDADOS
        if (dia < 1 || dia > 7)
            System.out.println("Error, el número debe estar entre 0 y 7");
        else if (dia == 1)
            System.out.println("Lunes");
        else if (dia == 2)
            System.out.println("Martes");
        else if (dia == 3)
            System.out.println("Miércoles");
        else if (dia == 4)
            System.out.println("Jueves");
        else if (dia == 5)
            System.out.println("Viernes");
        else if (dia == 6)
            System.out.println("Sábado");
        //else if (dia == 7)
        else
            System.out.println("Domingo");
        */
        
        // FORMA 2: CON SWITCH CASE
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error, el  número debe estar entre 1 y 7");
        }
    }
    
}
