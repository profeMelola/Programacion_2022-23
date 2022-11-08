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
    private final int MAYOR_EDAD = 18; //constante
    //private static final int MAYOR_EDAD = 18; //constante
    
    public final String dni;
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

    /*public void setDni(String dni) {
        this.dni = dni;
    }*/

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

    /**
     * Devuelve la diferencia de edad entre las dos personas
     * persona 'this'
     * @param p
     * @return 
     */
    public int diferenciaEdad(Persona p){

        //1. Con if... else
        if (p.getEdad() > this.edad)
            return p.getEdad() - edad;
        else 
            return edad - p.getEdad();
        
        //2. Con operador ternario
        //return (p.getEdad() > edad)? p.getEdad() - edad: edad - p.getEdad();
        
        //3. Math y obtener el valor absoluto
        //return Math.abs(edad - p.getEdad());
    }
    
    public boolean esMayorEdad(){
        /*if(edad >= 18 )
            return true;
        else 
            return false;*/
        return (edad >= MAYOR_EDAD);
    }
    
    public boolean esJubilado(){
        return (edad >=65);
    }
    
    // SOBREESCRITURA DE MÉTODOS DE OBJECT
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }


    
    
}
