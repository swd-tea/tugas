/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmikamikbandung;

/**
 *
 * @author HP
 */
public class Circle extends Shape{
    private int radius;
    public Circle(){
        radius = 1;
    }
public Circle(int x, int y, int r){
    super(x, y, c);
    radius = r;
    }
    public  int getRadius(){
        return radius;  
    }
    public double getArea(){
        return Math.PI * radius * radius;    
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }