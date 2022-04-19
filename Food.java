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


class Liquid extends Food{
    private int intFluidOunces;
    private double dblCurrentTemperature;
    private double dblFreezingTemperature;
    private double dblBoilingTemperature;
    
    public Liquid(){
    }
    
    public Liquid(String Name, int Calories, double Weight, String Description,int fluidOunces, double currenttemp, double freezingtemp, double boilingtemp){
        super(Name, Calories, Weight, Description);
        this.intFluidOunces= fluidOunces;
        this.dblCurrentTemperature= currenttemp;
        this.dblFreezingTemperature=freezingtemp;
        this.dblBoilingTemperature= boilingtemp;
    
    }
    
    public boolean isBoiling(){
        return (dblCurrentTemperature >= dblBoilingTemperature);
    }
    
    public boolean isFrozen(){
        return (dblCurrentTemperature<= dblFreezingTemperature);
    }
    
    public int getFluidOunces(){
        return intFluidOunces;
    }
    
    public void setFluidOunces(int value){
        this.intFluidOunces = value;
    }
    
    public void setCurrentTemperature(double value){
        dblCurrentTemperature = value;
    }
    
    public String toString(){
        return " Name: " + getName() +
                "\n Calories: " + getCalories() +
                "\n Weight: " + getWeight() +
                "\n Description: " + getDescription() +
                "\n FluidOunces: " + getFluidOunces() +
                "\n Current Temp: " + dblCurrentTemperature +
                "\n Freezinf Temp: " + dblFreezingTemperature +
                "\n Boiling Temperature: " + dblBoilingTemperature;
    }


}

class Solid extends Food{
    private double dblWeightInKilograms;
    private String strTexture;
    private boolean  isAllergen;
    private String strTypeOfCuisine;
    
    public Solid(){
    
    }
    
    public Solid(String Name, int Calories, double Weight, String Description, double weightinkilograms, String texture, boolean isallergen, String typeofcuisine){
        super(Name, Calories, Weight, Description);
        this.dblWeightInKilograms = weightinkilograms;
        this.strTexture= texture;
        this.isAllergen = isallergen;
        this.strTypeOfCuisine = typeofcuisine;
    
    }
    
    
    public double getWeightInKilograms(){
        return dblWeightInKilograms;
    }
    
    public void setWeightInKilograms(double weight){
        dblWeightInKilograms = weight;
    }
    
    public String getTexture(){
        return strTexture;
    }
    
    public boolean isAllergen(){
        return isAllergen;
    }
    
    public String getTypeOfCuisine(){
        return strTypeOfCuisine;
    }
    
    public String toString(){
        return " Name: " + getName() +
                "\n Calories: " + getCalories() +
                "\n Weight: " + getWeight() +
                "\n Description: " + getDescription() +
                "\n Weight in Kilograms: " + getWeightInKilograms()+
                "\n Texture: " + getTexture()+
                "\n Is Allergen: " + isAllergen() +
                "\n Type of Cuisine: " + getTypeOfCuisine(); 
    }
} 