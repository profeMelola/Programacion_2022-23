package es.daw.poo.model;

/**
 *
 * @author melola
 */
public class Persona {
    
    // ATRIBUTOS
    // dni, nombre, apellidos y edad.
    /*
    public String dni;
    public String nombre;
    public String apellidos;
    public int edad;
    */
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    // CONSTRUCTORES
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    

    public Persona(String dni) {
        this.dni = dni;
    }    
    
    
    // GETTERS & SETTERS

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    // MÉTODOS PROPIOS O DE COMPORTAMIENTO
    
    
    
    // SOBREESCRITURA DE MÉTODOS DE OBJECT
    
    
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }


    
    
}
