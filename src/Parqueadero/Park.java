package Parqueadero;
/**
 *
 * @author Estudiante
 */
import becker.robots.*;
public class Park {
    private Robot jey;
    private City paris;
    private Thing ladrillo;
    private Seccion[] sec;
    
    public Park(){
        this.paris = new City(15,15);
        this.jey = new Robot(paris,11,10,Direction.WEST,30);
        this.sec = new Seccion[2];
        int a=1;
        int b=1;
        while (a<=9){
            while (b<11){
                Wall muro = new Wall(this.paris,1,a,Direction.NORTH);     
                Wall muro2 = new Wall(this.paris,b,a,Direction.WEST);  
                Wall muro3 = new Wall(this.paris,b,a,Direction.EAST);
                Wall muro4 = new Wall(this.paris,11,a+1,Direction.NORTH);
                Wall muro7 = new Wall(this.paris,11,a+2,Direction.NORTH);
                Wall muro6 = new Wall(this.paris,11,b,Direction.SOUTH);
                b++;
                }
            b=1;
            a=a+3;
        }
        Wall muro5 = new Wall(this.paris,11,1,Direction.WEST);
    }
    public void Entrada(){
        int numero1=sec[0].numcar();
        int numero2=sec[1].numcar();
        int numero3=sec[2].numcar();
        
        if ((numero1<=numero2)&&(numero1<=numero3)){
           jey.move();
        }
    } 
}