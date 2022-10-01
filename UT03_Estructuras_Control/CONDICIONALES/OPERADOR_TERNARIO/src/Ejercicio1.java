package operadorternario;
/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/CONDICIONALES/OPERADOR_TERNARIO#ejercicio-1-positivonegativo
 */

/**
 *
 * @author melola
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var = -56;
        
        //String mensaje;
        
        //1. con if else
        /*if ( var >= 0 ) mensaje = "Es positivo";
        else mensaje = "Es negativo";*/
       
        //2. con operador ternario
        //mensaje = (var >=0)?"Es positivo":"Es negativo";
        //System.out.println(mensaje);
        
        //3.
        System.out.println( (var >= 0) ?"Es positivo":"Es negativo");
        
    }
    
}
