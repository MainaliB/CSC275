/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class GeometricObject {
    //attributes
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    //default constructor
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    //constructor that takes arguments
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    //get color
    public String getColor(){
        return color;
    }
    
    //set color
    public void setColor(String color){
        this.color = color;
    }
    
    //return if filled
    public boolean isFilled(){
        return filled;
    }
    
    //set filled
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    //return object's created date
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    public String toString(){
        return "Created on " + dateCreated +
                "\nColor " + color +
                "\n and filled " + filled;
    }
    
    
    
    
    
}
