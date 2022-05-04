/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Dog {
    private String name;
    private int age;
    private String color;
    private String breed;
    private double weight;

    public Dog() {
    }
    
    public Dog(String name, int age, String color, String breed, double weight){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.weight = weight;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean setName(String name){
        return true;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean setAge(int age){
        return true;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean setColor(String color){
        return true;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public boolean setBreed(String breed){
        return true;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public boolean setWeight(double weight){
        return true;
    }
    
    public String toString(){
        return name +" "+  age + " "+ color + " "+ breed + " "+ weight;
    }
    
    

    
}
