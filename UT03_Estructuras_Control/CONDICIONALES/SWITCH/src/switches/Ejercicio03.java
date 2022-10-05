/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/CONDICIONALES/SWITCH#ejercicio-3-switchmeses
 */
package switches;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduce un mes escrito: ");
        String mes = lector.nextLine().toLowerCase();
        
        //mes = mes.toLowerCase();
        
        switch(mes){
        //switch(mes.toLowerCase()){
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("Tienen 31 días");
                break;
            case "febrero":
                System.out.println("Tiene 28 días");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("Tienen 30 días");
                break;
            default:
                System.out.println("Opción no contemplada");
        }
        
        
        
    }
    
}
