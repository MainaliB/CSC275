/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Barbarian implements Comparable <Barbarian> {
    private int Health;
    private int Intelligence;
    private int Dexterity;
    private int Strength;
    private int Stamina;
    
    
    public Barbarian(){
    
    }
    
    public Barbarian (int health, int intelligence, int dexterity, int strength, int stamina){
        this.Health= health;
        this.Intelligence = intelligence;
        this.Dexterity = dexterity;
        this.Strength = strength;
        this.Stamina = stamina;
    }
    
    public int getHealth(){
        return Health;
    } 
    
    public void setHealth(int number){
        if (number <0){
            System.out.println("You can not set a value less than 0. Try again!");
        }
        else{
        Health = number;
        }
    }
    
    public int getIntelligence(){
        return Intelligence;
    }
    
    public void setIntelligence(int number){
        if (number <0){
            System.out.println("You can not set a value less than 0. Try again!");
        }
        else{
        Intelligence = number;
        }
    }
    
    public int getDexterity(){
        return Dexterity;
    }
    
    public void setDexterity(int number){
        if (number <0){
            System.out.println("You can not set a value less than 0. Try again!");
        }
        else{
        Dexterity = number;
        }
    }
    
    
    public int getStrength(){
        return Strength;
    }
    
    public void setStrength(int number){
        if (number <0){
            System.out.println("You can not set a value less than 0. Try again!");
        }
        else{
        Strength= number;
        }
    }
    
    public int getStamina(){
        return Stamina;
    }
    
    public void setStamina(int number){
        if (number <0){
            System.out.println("You can not set a value less than 0. Try again!");
        }
        else{
        Stamina= number;
        }
    }
    
    public double getDamageReducedPerBlock(){
        return (getDexterity() * 0.3 + getStrength()* 0.9);
    }
    
    public double getDamagePerMeleeAttack(){
        return (getDexterity() * 0.5 + getStrength() * 0.8);
    }
    
    public String toString(){
        return Health +" "+  Intelligence +" "+  Dexterity +" "+  Strength+" "+  Stamina; 
    }
    
    public int compareTo(Barbarian a){
        if (getStrength() > a.getStrength())
            return 1;
        else if (getStrength()< a.getStrength())
            return -1;
        else 
            return 0;
    
    
    }
    
    public boolean equals(Barbarian a){
        if(this.getHealth()== a.getHealth())
            return true;
        else 
            return false;
        
    }
    
}
