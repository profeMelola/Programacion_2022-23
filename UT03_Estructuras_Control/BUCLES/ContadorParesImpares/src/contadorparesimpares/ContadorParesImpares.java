/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/ContadorParesImpares
 */
package contadorparesimpares;

/**
 *
 * @author melol
 */
public class ContadorParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int pares=0,impares=0;
        
        for (int cont=100; cont <= 200; cont++){
            if (cont % 2 == 0)
                pares += cont;
            else
                impares += cont;
        }
        
        System.out.println("La suma total de los pares es "+pares);
        System.out.println("La suma total de los impares es "+impares);
        
    }
    
}
