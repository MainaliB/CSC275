/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Food {
    private String strName;
    private int intCalories;
    private double dblWeight;
    private String strDescription;
    
    public Food(){
        
    }
    
    public Food (String Name, int Calories, double Weight, String Description){
        this.strName = Name;
        this.intCalories= Calories;
        this.dblWeight= Weight;
        this.strDescription= Description;
    }
    
    public String getName(){
        return strName;
    }
    
    public void setName(String name){
        strName = name;
    }
    
    public int getCalories(){
        return intCalories;
    }
    
    public void setCalories(int value){
        intCalories = value;
    }
    
    public double getWeight(){
        return dblWeight;
    }
    
    public void setWeight(double value){
        dblWeight = value;
    }
    
    public String getDescription(){
        return strDescription;
    }
    
    public void setDescription(String description){
        strDescription = description;
    }
    
    public String toString(){
        return " Name: " + getName() +
                "\n Calories: " + getCalories() +
                "\n Weight: " + getWeight() +
                "\n Description: " + getDescription();
                
    }
}
