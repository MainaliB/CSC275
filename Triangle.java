/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    public Triangle(){
        
    }
    
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    
    //accessor methods
    public double getSide1(){
        return side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    //compute area of the triangle
    public double getArea(){
        double s = getPerimeter()/2;
        double area = Math.sqrt(s*(s-side1) + s*(s-side2) + s*(s-side3));
        return area;
    }
    
    //compute perimeter
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    
    public String toString(){
        return "Triangle: Side1 = " + side1 +
                "\n Side2 = " + side2 + 
                "\n Side3 = " + side3;
    }
    
}
