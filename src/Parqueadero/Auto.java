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
public class Auto {
    private String dueño;
    private String color;
    private String marca;
    private int placa;

    public Auto(String dueño, String color, String marca, int placa) {
        this.dueño = dueño;
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
    
}
