/*
 * package buclessencillos;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclessencillos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio2 {

    // Variable (constante) globar a nivel de clase
    static final String MENSAJE_FINAL = "Fin del programa";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        

        System.out.println("Introduce un número: ");
        int numero = input.nextInt();
        
        input.close();
        
        System.out.println("*****************");
        for(int i=1; i<= numero; i++)
            System.out.println(i);
        
        
        System.out.println("*****************");
        for(int i=1; i <= numero; i++)
            System.out.print(i + " ");
        
        //System.out.println("");
        System.out.println("\n"+MENSAJE_FINAL);
        
        
        
        
    }
    
}
