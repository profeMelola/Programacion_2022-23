/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    // CONSTRUCTOR
    public Alumno(String nombre, String NIA) {
        this.nombre = nombre;
        this.NIA = NIA;
        notas = new float[Utilidades.MODULOS.length];
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
    /**
     * 
     * @return 
     */
    public int calcularNotaMedia(){
        float sumatorio = 0.0f;
        /*for (int i = 0; i < notas.length; i++) {
            sumatorio += notas[i];
        }*/
        for( float nota: notas)
            sumatorio += nota;
        
        //return (int)sumatorio / notas.length;
        return Math.round(sumatorio / notas.length);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", NIA=" + NIA + ", notas=" + Arrays.toString(notas) + '}';
    }
    
    
        
}
