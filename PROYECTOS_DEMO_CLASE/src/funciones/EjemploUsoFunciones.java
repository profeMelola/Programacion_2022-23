package funciones;

/**
 * Ejemplo visto en clase el martes 11 de octubre
 * Este proyecto ha servido de base para explicar por primera vez las
 * funciones o métodos estáticos y el paso por valor (copia) de los argumentos.
 * No se ha utilizado sobrecarga de métodos. Estamos empezando.
 * @author melola
 */
public class EjemploUsoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**********************************************************");
        System.out.println("CASO 1: llamada a un método que no recibe ni devuelve nada");
        // LLamar al método saluda
        saluda();
              
        System.out.println("*CASO 2: llamada a un método que no recibe argumentos pero devuelve algo");
        
        String saludo = saluda2();
        System.out.println(saludo);
        System.out.println(saluda2());
        
        System.out.println("*CASO 3: llamada a un método que recibe un argumento y devuelve algo");
        String cadena = "Hola de nuevo!";
        System.out.println(saluda3(cadena));
        
        System.out.println("Pinto de nuevo la cadena del main: "+cadena);
        
        //System.out.println(saluda3("Hola de nuevo!"));

        System.out.println("*********************************************");
        System.out.println("********* Nuevo ejemplo usando enteros *****");
        int contador = 0;
        System.out.println("Caso 1: sin return ");
        incrementaContador(contador);
        System.out.println("[MAIN] contador: "+contador);
        System.out.println("");
        System.out.println("Caso 2: con return ");
        contador = incrementaContador2(contador);
        System.out.println("[MAIN] contador: "+contador);
        System.out.println("*********************************************");
        
        
        
        
        
        
        
    }
    
    /**
     * Método que muestra por consola un saludo
     */
    public static void saluda(){
        System.out.println("Hola a todos!!!!");
    }
    
    /**
     * Método que devuelve en un String un saludo
     * @return cadena de texto
     */
    public static String saluda2(){
        return "Hola a todos!!!!";
    }
    
    /**
     * Método que recibe una cadena y devuelve dicha cadena con un texto al final
     * @param cadena
     * @return 
     */
    public static String saluda3(String cadena){
        
        //cadena = cadena + " CHIMPÚN!!!!";
        
        //cadena += " CHIMPÚN!!!!";
        //return cadena;
        
        return cadena+=" CHIMPÚN!!!";
        
    }
    
    /**
     * 
     * @param contador 
     */
    public static void incrementaContador(int contador){
        contador++;
        System.out.println("[incrementaContador] contador: "+contador);
    }
    
    /**
     * 
     * @param contador
     * @return 
     */
    public static int incrementaContador2(int contador){
        contador++;
        return contador;
    }
    
}
