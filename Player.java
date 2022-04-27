/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Player implements Comparable <Player> {
    private int Health;
    private int Intelligence;
    private int Dexterity;
    private int Strength;
    private int Stamina;
    
    
    public Player(){
    
    }
    
    public Player(int health, int intelligence, int dexterity, int strength, int stamina){
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
    
    public String toString(){
        return Health + " " + Intelligence + " " + Dexterity + " " + Strength + " "+ Stamina;
    }
    
    public int compareTo(Player a){
        if (getStrength() > a.getStrength())
            return 1;
        else if (getStrength()< a.getStrength())
            return -1;
        else 
            return 0;
    
    
    }
    
    public boolean equals(Player a){
        if(this.getHealth()== a.getHealth())
            return true;
        else 
            return false;
        
    }
    
    
    
}
//we are not adding any more attributes or other functionality in subclass Archer and Barbarian
class Archer extends Player{
    
    public Archer(int Health, int Intelligence, int Dexterity, int Strength, int Stamina){
        super(Health, Intelligence, Dexterity, Strength, Stamina);
    }
    public String toString(){
        return "Health: " + getHealth() + "\n Intelligence: " + getIntelligence() +
                "\n Dexterity: " + getDexterity() + "\n Strength: " + getStrength()+
                "\n Stamina: " + getStamina();
    
    }

}

class Barbarian extends Player{
    
    public Barbarian(int Health, int Intelligence, int Dexterity, int Strength, int Stamina){
        super(Health, Intelligence, Dexterity, Strength, Stamina);
    }
    
    public String toString(){
        return "Health: " + getHealth() + "\n Intelligence: " + getIntelligence() +
                "\n Dexterity: " + getDexterity() + "\n Strength: " + getStrength()+
                "\n Stamina: " + getStamina();
    
    }

}

//two unique attributes  and getter and setter are added in the newly added subclass
class Cleric extends Player{
    private String Power;
    private String Domain;
    
    public Cleric(int Health, int Intelligence, int Dexterity, int Strength, int Stamina, String Power, String Domain){
        super(Health, Intelligence, Dexterity, Strength, Stamina);
        this.Power = Power;
        this.Domain = Domain;
    }
    public String getPower(){
        return Power;
    }
    
    public void setPower(String power){
        Power = power;
    }
    
    public String getDomain(){
        return Domain;
    }
    
    public void setDomain(String domain){
        Power = domain;
    }
    
    public String toString(){
        return "Health: " + getHealth() + "\n Intelligence: " + getIntelligence() +
                "\n Dexterity: " + getDexterity() + "\n Strength: " + getStrength()+
                "\n Stamina: " + getStamina() + "\n Power: " + Power +
                "\n Domain: " + Domain;
    
    }
    
    

}

class Rogue extends Player{
    private String Mastery;
    private int Agility;
    public Rogue(int Health, int Intelligence, int Dexterity, int Strength, int Stamina, String Mastery, int Agility){
        super(Health, Intelligence, Dexterity, Strength, Stamina);
        this.Agility = Agility;
        this.Mastery = Mastery;
    }
    
    public String getMastery(){
        return Mastery;
    }
    
    public void setPower(String mastery){
        Mastery = mastery;
    }
    
    public int getAgility(){
        return Agility;
    }
    
    public void setAgility(int number){
        Agility = number;
    }
    
    public String toString(){
        return "Health: " + getHealth() + "\n Intelligence: " + getIntelligence() +
                "\n Dexterity: " + getDexterity() + "\n Strength: " + getStrength()+
                "\n Stamina: " + getStamina() + "\n Mastery: " + Mastery +
                "\n Agility: " + Agility;
    
    }
    

}

class Warlock extends Player{
    private String Magic ;
    private Double Charisma;
    
    public Warlock(int Health, int Intelligence, int Dexterity, int Strength, int Stamina, String Magic, double Charisma){
        super(Health, Intelligence, Dexterity, Strength, Stamina);
        this.Magic = Magic;
        this.Charisma = Charisma;
    }
    
    public String getMagic(){
        return Magic;
    }
    
    public void setMagic(String magic){
        Magic = magic;
    }
    
    public double getCharisma(){
        return Charisma;
    }
    
    public void setCharisma( double value){
        Charisma = value;
    }
    
    public String toString(){
        return "Health: " + getHealth() + "\n Intelligence: " + getIntelligence() +
                "\n Dexterity: " + getDexterity() + "\n Strength: " + getStrength()+
                "\n Stamina: " + getStamina() + "\n Magic: " + Magic +
                "\n Charisma: " + Charisma;
    
    }

}
