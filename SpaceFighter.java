/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class SpaceFighter {
    private boolean cloakingInstalled;
    private boolean fTLInstalled;
    private double attackSpeed;
    private double damageToInflict;
    private double shield;
    private double defenseMultiplier;
    
    
    public SpaceFighter(){
    }
    
    public SpaceFighter(boolean cloakinginstalled, boolean ftlinstalled,
            double attackspeed, double damagetoinflict, double shield, 
            double defensemultiplier){
        
        this.cloakingInstalled = cloakinginstalled;
        this.fTLInstalled = ftlinstalled;
        this.attackSpeed= attackspeed;
        this.damageToInflict= damagetoinflict;
        this.shield= shield;
        this.defenseMultiplier= defensemultiplier;
    
    }
    
    public boolean isCloakingInstalled(){
        return cloakingInstalled;
    }
    
    public boolean isFTLInstalled(){
        return fTLInstalled;
    }
    
    public double getAttackSpeed(){
        return attackSpeed;
    }
            
    public double DamageToInflict(){
        return damageToInflict;
    }
    
    public boolean attack(SpaceFighter a){
    double totalDamage = a.damageToInflict * a.attackSpeed;
    if (totalDamage > a.getDefenseMultiplier()){
        return true;
    }
    else{
        return false;
    }
    
    }
    public double getShield(){
        return shield;
    }
    
    
    public double getDefenseMultiplier(){
        return defenseMultiplier;
    }
    
    public String toString(){
        return cloakingInstalled + " "+ fTLInstalled + " " + attackSpeed + " "+
                damageToInflict + " " + shield + " " + defenseMultiplier;
    }
    
}
