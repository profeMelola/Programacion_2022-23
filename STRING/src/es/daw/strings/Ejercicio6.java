package es.daw.strings;

/**
 *
 * @author melola
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String txt ="HOLA AMIGOS";
        String parte1 = txt.substring(0, 4);
        System.out.println("PARTE 1: "+parte1);
        String parte2 = txt.substring(4);
        System.out.println("PARTE 2: <"+parte2+">");
        System.out.println("PARTE 2 v2: <"+txt.substring(4, txt.length())+">");
        //System.out.println("PARTE 2 v3: <"+txt.substring(3, 55)+">");
                
                
    }
    
}
