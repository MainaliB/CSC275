/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Drill {
    private double efficiency;
    private double durability;
    private double maxDepth;
    
    
    public Drill(){
    }
    
    public Drill(double efficiency, double durability, double maxdepth){
        this.efficiency = efficiency;
        this.durability = durability;
        this.maxDepth = maxdepth;
        
    }
    
    public double getEfficiency(){
        return efficiency;
    }
    
    public double getDurability(){
        return durability;
    }
    
    public double getMaxDepth(){
        return maxDepth;
    }
    
    public double mineGold(Asteroid a){
        return a.getGoldOre()-100 * getEfficiency();
        
    
    }
    
    public double mineSilver(Asteroid a){
        return a.getSilverOre()- 100* getEfficiency();
    }
    
    public double minePlatinum(Asteroid a){
        return a.getPlatinumOre()- 100* getEfficiency();
    }
    
    public String toString(){
        return efficiency +" "+  durability + " "+ maxDepth ;
    }
    
    
    
}
