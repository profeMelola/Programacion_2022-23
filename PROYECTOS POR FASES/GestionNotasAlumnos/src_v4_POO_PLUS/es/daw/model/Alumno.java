
package es.daw.model;

import es.daw.util.Utilidades;
import java.util.Arrays;

/**
 *
 * @author melola
 */
    
public class Alumno {
    
    // ATRIBUTOS
    private String nombre;
    private final String NIA;
    private float[] notas;
    
    //nuevo atributo con la nota media de cada alumno
    private int notaMedia; 
    

    // CONSTRUCTOR
    public Alumno(String nombre, String NIA) {
        this.nombre = nombre;
        this.NIA = NIA;
        notas = new float[Utilidades.MODULOS.length];
        //inicializo a 1 como valor por defecto ( nota más baja de FP)
        notaMedia = 1; 
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getNotas() {
        //return notas; //sin encapsular
        return notas.clone();
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
        
        // IMPORTANTE!!!! Si se actualizan las notas,
        //hay que actualizar su nota media!!!
        calcularNotaMedia();
    }
    
    // Nuevos método getter para obtener la nota media. 
    // No hace falta el setter porque 
    //solo se inicializa su valor a través del método calcularNotaMedia

    public int  getNotaMedia() {
        return notaMedia;
    }
    
    
    // MÉTODO PROPIO O DE COMPORTAMIENTO
    /**
     * 
     * @return 
     */
    public void calcularNotaMedia(){
    //public int calcularNotaMedia(){
        float sumatorio = 0.0f;
        /*for (int i = 0; i < notas.length; i++) {
            sumatorio += notas[i];
        }*/
        for( float nota: notas)
            sumatorio += nota;
        
        //return (int)sumatorio / notas.length;
        //return Math.round(sumatorio / notas.length);
        notaMedia = Math.round(sumatorio / notas.length);
    }


    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", NIA=" + NIA + ", "
                + "notas=" + Arrays.toString(notas) + ", notaMedia=" + notaMedia + '}';
    }
    
    
    
        
}