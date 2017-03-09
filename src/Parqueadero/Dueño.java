/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

/**
 *
 * @author Estudiante
 */
public class Dueño {
    private String nombre;
    private String apellido; 
    private int celular;
    
    public Dueño(String nombre, String apellido, int celular){
        this.nombre=nombre;
        this.apellido=apellido;
        this.celular=celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
}
