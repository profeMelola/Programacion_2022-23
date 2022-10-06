/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/Ejercicios_Sencillos#ejercicio-2
 */
package buclessencillos;

/**
 *
 * @author melola
 */
public class Ejercicio3 {
    
    // Variable (constante) globar a nivel de clase
    static final String MENSAJE_FINAL = "Fin del programa";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 100;
        
        System.out.println("*** Con for ***");
        //Con un for
        for(int i = contador; i>0; i--){
            System.out.println(i);
        }

        System.out.println("*** Con while ***");
        // Con un while
        while(contador > 0){
            System.out.println(contador);
            contador--;
        }
        
    }
    
}
