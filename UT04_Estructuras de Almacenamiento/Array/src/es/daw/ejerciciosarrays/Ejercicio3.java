package es.daw.ejerciciosarrays;

/**
 *
 * @author melola
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = {1,20,3,30,8};
        
        int numeroMax=maximo(numeros);
        
        System.out.println(numeroMax);        
        
    }
    
    /**
     * Función que devuelve el número mayor de un array de enteros
     * @param numeros
     * @return 
     */
    public static int maximo(int numeros[]){
        int numeroMax = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMax)
                numeroMax = numeros[i];
        }
 
        /*for (int numero:numeros) {
            if (numero>numeroMax) {
                numeroMax=numero;
            }
        }*/
        
        return numeroMax;
        
    }
}
