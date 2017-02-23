/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;
import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Ej2 {
    private Robot r;
    private Thing C;
    private City Cl;
    
    public Ej2(){
        Cl= new City(15,15);
        r= new Robot(Cl, 6, 2, Direction.WEST,80);
    }
    public void Right(){
        r.turnLeft();
        r.turnLeft();
        r.turnLeft();
    }
    public void Mp(){
        r.move();
        r.putThing();
    }
    public void A1(){
        r.move();
        r.turnLeft();
        r.move();
        r.putThing();
        this.Right();
        for (int i = 0; i < 4; i++) {
        this.Mp();
        }
        r.turnLeft();
        r.move();
        r.turnLeft();
        for (int i = 0; i < 4; i++) {
            r.move();}
        r.turnLeft();
    }
    public void A2(){
        r.move();
        r.turnLeft();
        this.Mp();
        r.turnLeft();
        r.turnLeft();
        for (int i = 0; i < 2; i++) {
            this.Mp();
        }
        r.turnLeft();
        for (int i = 0; i < 2; i++) {
            this.Mp();
        }
        r.turnLeft();
        for (int i = 0; i < 3; i++) {
            this.Mp();
        }
        this.Right();
        r.move();
        r.putThing();
        r.move();
        r.putThing();
    }
}    

