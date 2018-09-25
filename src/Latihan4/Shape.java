/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author ASUS
 */
public class Shape {
    //Private member variable
    private String color;
    //constructor
    public Shape (String color){
        this.color=color;
    }
    
    public String toString(){
        return "Shape[Color=" + color + "]";
    }
    //All shapes must have a method called getArea().
    public double getArea(){
        //We need to return some value to compile the Program
        System.out.println("Shape unknow! Cannot compute area");
        return 0;
    }
}
