package trastearconarrays;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class TrastearConArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        // Declaración de un array de enteros de tamaño 10
        int size = 10;
        int[] unArray = new int[size];
        
        unArray[0] = 100; //siempre empieza el índice por 0
        unArray[1] = 200;
        unArray[2] = 300;
        unArray[3] = 400;
        unArray[4] = 500;
        unArray[5] = 600;
        unArray[6] = 700;
        unArray[7] = 800;
        unArray[8] = 900;
        unArray[9] = 1000;        
        
        int[] unArray2 = { 
                            100, 200, 300,
			    400, 500, 600, 
			    700, 800, 900, 
                            1000
			};
        
        int[] unArray3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Array 1:");
        pintaArray(unArray);
        System.out.println("Array 2:");
        pintaArray(unArray2);
        System.out.println("Array 3:");
        pintaArray(unArray3);
        
        // Copia de array...
        //unArray3 = unArray2; //apuntan a la misma referencia, no es una copia!!!
        unArray3 = copiaArrayEnteros(unArray2);
        
        System.out.println("Array 3:");
        pintaArray(unArray3);
        
        unArray3[0] = 666;
        
        System.out.println("Array 3 con la primera posición modificada:");
        pintaArray(unArray3);
        
        System.out.println("Array 2 de nuevo!!!!");
        pintaArray(unArray2);
        
        unArray2[1]=-666;
        
        System.out.println("Array 3 el retorno!!!");
        pintaArray(unArray3);
        
        System.out.println("Array 2 again!!!!");
        pintaArray(unArray2);
        
        //------------- ARRAY DE STRING ---------------
        String[] valores = {"uno","dos","tres"};
        
        for(String valor: valores){
            System.out.println(valor);
        }
        
        // PARA MÁS ADELANTE, TRANQUILOS!!!
        // TERCERA FORMA DE RECORRER UN ARRAY: A PARTIR DE JAVA 8 
        // PROGRAMACIÓN FUNCIONAL
        System.out.println("Array de valores String:");
        Arrays.asList(valores).forEach(System.out::println);*/
        
        // -------------- PROVOCANDO ERRORES!!!! 
        //error1();
        error2();
        
    }
    
    /**
     * pintaArray
     * @param miArray 
     */
    public static void pintaArray(int[] miArray){
        /*System.out.println("Forma tradicional:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
            
        }
        System.out.println("For each:");*/
        for(int elemento: miArray)
            System.out.println(elemento);
        
                
    }
    
    /**
     * copiaArrayEnteros
     * @param arrayInit
     * @return 
     */
    public static int[] copiaArrayEnteros(int[] arrayInit){
        int[] arrayEnd = new int[arrayInit.length];
        
//        int index = 0;
//        
//        for(int elem: arrayInit){
//            arrayEnd[index] = elem;
//            index++;
//        }
        
        for (int i = 0; i < arrayEnd.length; i++) {
            arrayEnd[i] = arrayInit[i];
        }
        
        //System.arraycopy(arrayInit, 0, arrayEnd, 0, arrayEnd.length);
        
        return arrayEnd;
    }
    
    
    public static void error1(){
        
        int size = 0; // el tamaño lo obtengo de cualquier lado!!! cuidadín!!!
        
        int[] array = new int[size];
        
        //int number = array[0];
        int number;
        
        if (array.length > 0) number = array[0];
    }
    
    public static void error2(){
        int[] array = new int[10];
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            
        }
    }
}
