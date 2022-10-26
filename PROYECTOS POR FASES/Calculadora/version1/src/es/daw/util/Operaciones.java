package es.daw.util;

/**
 *
 * @author melola
 */
public class Operaciones {
    /**
     * Método estático que realiza la suma de dos operadores y devuelve el resultado
     * @param op1
     * @param op2
     * @return 
     */
    public static float sumar(float op1, float op2){
        //float resultado = op1 + op2;
        //return resultado;
        return op1 + op2; 
        
    }
    
    public static float restar(float op1, float op2){
        return op1 - op2; 
    }

    public static float multiplicar(float op1, float op2){
        return op1 * op2; 
    }

    public static float dividir(float op1, float op2){
        return op1 / op2; 
    }

    public static float resto(float op1, float op2){
        return op1 % op2; 
    }    
    
}
