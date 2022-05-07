/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Circle extends GeometricObject {
    private Point centerPoint;
    private double radius;
    
    public Circle(){
        
    }
    
    public Circle(Point centerpoint, double radius){
        this.centerPoint = centerpoint;
        this.radius = radius;
    }
    
    public double getArea(){
        return (Math.PI * radius * radius);
    }
    
    public double getDiameter(){
        return (2 * radius);
    }
    
    public double getCircumference(){
        return (2* Math.PI * radius);
    }
    
    public String toString(){
        return "Centerpoint of the circle is "+ centerPoint.getXValue()+ " and "+ centerPoint.getYValue()
                + " and radius is " + radius;
    }
}
