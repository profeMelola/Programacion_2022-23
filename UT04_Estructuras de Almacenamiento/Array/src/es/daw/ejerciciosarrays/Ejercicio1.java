/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT04_Estructuras%20de%20Almacenamiento/Array#ejercicio-1
 */
package es.daw.ejerciciosarrays;

/**
 *
 * @author melola
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valores[] = new int[10];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random()*100 + 1);
            System.out.println(valores[i]);
        }
        
        
        int suma = 0;
        for(int valor: valores)
            suma += valor;
        
        System.out.println("La suma de los valores aleatorios es "+suma);
    }
    
}
