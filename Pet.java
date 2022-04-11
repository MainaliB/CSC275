/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Pet {
    private String name;
    private int age;
    private String color;
    
    public Pet(){
    
    }
    
    public Pet(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
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
    
    public String toString(){
        return name + " "+ age + " "+ color;
    }
    
}

class Dog extends Pet{
    private String breed;
    private double weight;
    
    public Dog(String name, int age, String color, String breed, double weight){
        super(name, age,  color);
        this.breed = breed;
        this.weight = weight;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public void setBreed(String Breed){
        breed = Breed;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double value){
        weight = value;
    }
    
    public String toString(){
        return "Name: " + getName()+
                "\n Age: " + getAge()+
                "\n Color: " + getColor()+
                "\n Breed: " + breed +
                "\n  Weight: " + weight;
    }
}

class Cat extends Pet{
    private String breed;
    private String gender;
    
    public Cat(String name, int age, String color, String breed, String gender){
        super(name, age, color);
        this.breed = breed;
        this.gender = gender;
    }
    public String getBreed(){
        return breed;
    }
    
    public void setBreed(String Breed){
        breed = Breed;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setWeight(String Gender ){
        gender = Gender;
    }
    public String toString(){
        return "Name: " + getName()+
                "\n Age: " + getAge()+
                "\n Color: " + getColor()+
                "\n Breed: " + breed +
                "\n  Gender: " + gender;
    }

}


class Monkey extends Pet{
    private double height;
    private double tailLength;
    
    public Monkey(String name, int age, String color, double height, double tailLength){
        super(name, age, color);
        this.height = height;
        this.tailLength = tailLength;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight( double value){
        height = value;
    }
    
    
    public double getTailLength(){
        return tailLength;
    }
    
    public void setTailLength( double value){
        tailLength = value;
    }
    
    public String toString(){
        return "Name: " + getName()+
                "\n Age: " + getAge()+
                "\n Color: " + getColor()+
                "\n Height: " + height +
                "\n  Tail Lenght: " + tailLength;
    }
    
    
}
