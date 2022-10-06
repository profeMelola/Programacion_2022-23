/*
 * MOSTRAR LOS NÚMEROS PARES E IMPARES DEL 1 AL 20.
 * POR EJEMPLO:
 * 2 4 6 8 10 ...
 * 1 3 5 7 9 ....
 * OBJETIVO: Trabajar con bucles e incrementos. No usar el %
 */
package buclessencillos;

/**
 *
 * @author melola
 */
public class ParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pares
        System.out.println("* Pares");
        for (int i=0; i<= 20; i += 2)
            System.out.print(i+" ");
        
        
        //Impares
        System.out.println("\n* Impares");
        for (int i=1; i <= 20; i+= 2)
            System.out.print(i+" ");
        
        
    }
    
}
