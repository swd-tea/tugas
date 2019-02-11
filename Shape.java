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
public class Shape {
    

    public Shape (String id)
    {this.id = id;}

    //This abstract method must be defined in a concrete subclass.
    //Note that it is called in this class in the toString method.
    public abstract double getArea();

    public String getId()
    {return id;}
    
    public String toString( )
    {return "Shape[id="+id+",area="+getArea()+"]";}

    private String id;
  }
