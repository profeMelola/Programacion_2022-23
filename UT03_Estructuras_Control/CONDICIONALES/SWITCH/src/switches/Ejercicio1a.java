/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/CONDICIONALES/SWITCH#parte-i
 */
package switches;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe el carácter:");
        char letra = lector.next().charAt(0);
        
        // Si cierro el Scanner tiene que ser cuando no lo vaya a utilizar más para leer datos de consola
        // Se cierra solo porque implementa la interface Closeable
        // Es buena práctica cerrarlo explícitamente, pero hay que tener cuidado porque una vez cerrado no se puede volver a utilizar
        // Por ahora y hasta que trabajemos con flujos de entrada salida, no lo cerramos explícitamente. Se cierra solo
        //lector.close(); 
        
        /*switch(letra){
            case 'a':
                System.out.println("Es la vocal a");
                break;
            case 'e':
                System.out.println("Es la vocal e");
                break;
            case 'i':
                System.out.println("Es la vocal i");
                break;
            case 'o':
                System.out.println("Es la vocal o");
                break;
            case 'u':
                System.out.println("Es la vocal u");
                break;
            default:
                System.out.println("No es vocal: "+letra);
        }*/
        
        /*
        // CASO 2: para controlar si escribe la vocal en mayúsculas
        //String letraS = ""+letra; //Concatenar un String con el + convierte cualquier dato a String
        String letraS = Character.toString(letra); //Otra forma de convertir el carácter a String. Con su clase envoltorio (wrapper).
        
        switch(letraS.toLowerCase()){
            case "a":
                System.out.println("Es la vocal a");
                break;
            case "e":
                System.out.println("Es la vocal e");
                break;
            case "i":
                System.out.println("Es la vocal i");
                break;
            case "o":
                System.out.println("Es la vocal o");
                break;
            case "u":
                System.out.println("Es la vocal u");
                break;
            default:
                System.out.println("No es vocal: "+letra);
                
        }*/
        
        // CASO 3: controlando con ASCII si es una vocal en mayúsculas
        //A 65, a 97
        //E 70, e 101
        //I 73, i 105
        //O 79, o 111
        //U 85, u 117
        
        switch(letra){
            case 65:
            case 97:
                System.out.println("Es la vocal a");
                break;
            case 70:
            case 101:
                System.out.println("Es la vocal e");
                break;
            case 73:
            case 105:
                System.out.println("Es la vocal i");
                break;
            case 79:
            case 111:
                System.out.println("Es la vocal o");
                break;
            case 85:
            case 117:
                System.out.println("Es la vocal u");
                break;
            default:
                System.out.println("No es vocal: "+letra);
        }
    }
}
