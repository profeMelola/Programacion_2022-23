/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/BUCLES/TablasMultiplicar
 */
package tablamultiplicar;

/**
 *
 * @author melola
 */
public class Tablamultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for(int i=1;i<=9;i++){
            System.out.println("****> Tabla del "+i);
            for(int j=0; j<=10;j++){
                System.out.println(i +"X"+j+"="+ (i*j));
            }
            System.out.println("******>fin de la tabla");
        }
        
    }
    
}
