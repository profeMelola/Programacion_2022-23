package es.daw.concesionario.model;

import java.time.LocalDate;

/**
 *
 * @author melola
 */
public class Coche {
    
    // ATRIBUTOS
    private String matricula;
    private int numPuertas;
    private String marca;
    private int kilometros;
    private int precio;
    
    private LocalDate fechaAlta; //fecha cuando se da de alta el coche en el concesionario
    
    // CONSTRUCCIONES
    // Constructor con todos los atributos (menos fecha que se pone de forma automática)
    public Coche(String matricula, int numPuertas, String marca, int kilometros, int precio) {
        // Primera forma
        /*this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.kilometros = kilometros;
        this.precio = precio;
        fechaAlta = LocalDate.now(); 
        */
        
        this(matricula, numPuertas, marca, kilometros);
        this.precio = precio;
        
    }

    
    public Coche(String matricula, int numPuertas, String marca, int kilometros) {
        
        /*
        // Primera forma
        this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.kilometros = kilometros;
        //En el momento de dar de alta el coche en el concesionario ponemos la fecha del sistema
        fechaAlta = LocalDate.now(); 
        */
        
        // Segunda forma
        this(matricula,numPuertas,marca);
        this.kilometros = kilometros;
    }

    // Como mínimo para dar de alta un coche necesitas la 
    // matrícula
    // numPuertas
    // marca
    public Coche(String matricula, int numPuertas, String marca) {
        this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.marca = marca;
        //En el momento de dar de alta el coche en el concesionario ponemos la fecha del sistema
        fechaAlta = LocalDate.now(); 
    }
    
    
    // GETTERS & SETTER

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    

    // MÉTODOS DE COMPORTAMIENTO...
    /**
     * El descuento es la cantida en euros (no porcentaje)
     * @param descuento 
     */
    public void aplicarDescuento(int descuento){
        if (descuento > 0 && descuento < precio)
            precio -= descuento;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nLa información del coche es:");
        sb.append("\n\tLa matricula=" + matricula);
        sb.append("\n\tEl número de puertas=" + numPuertas);
        sb.append("\n\tLa marca=" + marca);
        sb.append("\n\tLos kilometros=" + kilometros);
        sb.append("\n\tEl precio final=" + precio);
        sb.append("\n\tLa fecha de alta del coche en el concesionario=" + fechaAlta+"\n");
        
        return sb.toString();
        
    }
    
    
    
}
