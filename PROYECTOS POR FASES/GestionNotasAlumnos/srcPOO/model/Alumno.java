package model;

/**
 *
 * @author melola
 */
public class Alumno {
    
    // ATRIBUTOS
    private String nombre;
    private final String NIA;
    private float[] notas;

    // CONSTRUCTOR
    public Alumno(String nombre, String NIA) {
        this.nombre = nombre;
        this.NIA = NIA;
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    // MÉTODO PROPIO O DE COMPORTAMIENTO
    /*public int calcularNotaMedia(){
        // PENDIENTE!!!
        //notas
    }*/
    
    

    
}
