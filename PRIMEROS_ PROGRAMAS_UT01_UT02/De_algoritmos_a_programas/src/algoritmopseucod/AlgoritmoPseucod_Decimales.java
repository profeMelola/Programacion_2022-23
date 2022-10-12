package algoritmopseucod;

/**
 *
 * @author melola
 */
public class AlgoritmoPseucod_Decimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // -------------------------------------------
        
        //declarar la base y poner su valor
        int base = 3;
        //declarar la altura y poner su valor
        int altura = 5;
        
        //declarar una constante para pruebas
        //final int constante = 3;
        //constante = 3; //en una constante no puedo sobreescribir su valor
        
        //base = 3; // en una variable puedo sobreescribir su valor
        
        // PRUEBAS CON DECIMALES
        //float baseF = 5; //puedo asignar un valor entero a un decimal
        // base = 5.5; // no puedo asignar un valor decimal a un entero
        
        
        //Calcular el area
        //int area = (base * altura)/2;
        
        // Para que salga el area con decimales
        
        // OJO!!! si se opera con dos enteros el resultado es entero
        float area1 = (base * altura) / 2; 
        float area2 = (float)base*altura/2;
        
        //Pintar por consola
        System.out.println("CASO 1: EL ÁREA ES: "+area1);
        System.out.println("CASO 2: EL ÁREA ES: "+area2);
        
        
        //----------------
        // CASO 3
        float base3 = 3;
        float altura3 = 5;
        
        float area3 = (base3 * altura3)/2;
        System.out.println("CASO 3: EL ÁREA ES: "+area3);
        
        
        
        
        
        
    }
    
    /*
    public void pintaAltura(){
        System.out.println("EL ÁREA ES: "+area);
    }
    */
    
}
