/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nan;

/**
 *
 * @author melola
 */
public class NaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(2 % 0); //ArithmeticException porque es un entero
        
        //System.out.println(2.0 % 0); //NaN porque es un decimal (coma flotante)
        
        //" NaN " significa "no es un número". 
        // “Nan” se produce si una operación de coma flotante tiene algunos 
        // parámetros de entrada que hacen que la operación produzca algún resultado indefinido. 
        //Por ejemplo, 0.0 dividido por 0 es aritméticamente indefinido.         
        
        System.out.println("2·0 / 0 = "+2.0/0); // Esto da infinity
        
        System.out.println("0.0 / 0 = "+0.0/0); // Esto da NaN
        
        double nan = 0.0/0;
        
        if (Double.isNaN(nan))
            System.out.println("No es un número!!!!!");
        
        //Encontrar la raíz cuadrada de un número negativo también no está definido.
        //System.out.println(Math.sqrt(-1));
        
    }
    
}
