/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT04_Estructuras%20de%20Almacenamiento/Array#ejercicio-5
 */
package es.daw.ejerciciosarrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author melola
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] pares = rellenaDeNumerosPares(10, 100);
        
        System.out.println("Array de números pares ordenados: "+Arrays.toString(pares));
        
    }
    
    public static int[] rellenaDeNumerosPares(int longitud, int fin){
        int pares[] = new int[longitud];
        
        int i = 0;
        
        Random r = new Random();
        int num = 0;
        
        while( i < pares.length){
            //int num = (int) (Math.random() * fin + 1);
            
            num = r.nextInt(fin) + 1;
            
            if (num % 2 == 0){
                pares[i] = num;
                i++;
            }
        }
        
        // ordenación ascendente
        //Arrays.sort(pares);
        // PENDIENTE EN ORDEN DESCENDENTE
        ordenarAscendente(pares);
        
        return pares;
        
    }
    
    /*
     * Algoritmo de ordenación por intercambio
     */
    public static void ordenarAscendente(int[] numeros){
        // Recorremos el array desde la primera posición hasta la penúltima
        for (int i=0; i < (numeros.length - 1);i++){
            //Recorremos el array desde el elemento siguiente (i+1) hasta la última posición
            for(int j= (i+1); j< numeros.length; j++){
                //Si el elemento en posición anterior es mayor que el elemento en posición posterior
                //hago el cambio
                if (numeros[i] > numeros[j]){
                    //Intercambiamos valores
                    int varAux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = varAux;
                }
            }
            
        }
    }
}
