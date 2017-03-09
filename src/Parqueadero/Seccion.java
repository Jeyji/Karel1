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
public class Seccion {
    private String nombre;
    private Auto[] au = new Auto[10];
    public void Lista(){
        for (int i=0; i<10;i++){
            System.out.println("Dueño:"+this.au[i].getDueño());
            System.out.println("Placa:"+this.au[i].getPlaca());
            System.out.println("Marca:"+this.au[i].getMarca());
            System.out.println("Color:"+this.au[i].getColor());
        }
    } 
    public int numcar(){
        int t=0;
        for (int u=0;u<au.length;u++){
            if (!(au[u]==null)){
                t++;
            }       
        }
        return t;
    }   
}