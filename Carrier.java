/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Carrier {
    private SpaceFighter [] spaceFighterDocks;
    private Drill [] drillDocks;
    private String [] cargohold;
    
    public Carrier(){
    }
    
    public Carrier(int numberOfSpaceFighterDocks, int numberOfDrillDocks, int cargoholdSize){
        this.spaceFighterDocks = new SpaceFighter[numberOfSpaceFighterDocks];
        this.drillDocks = new Drill[numberOfDrillDocks];
        this.cargohold = new String[cargoholdSize];
    
    }
    //Assuming we will be deploying the spacefighter docked in index 0;
    public SpaceFighter deployFighter(){
        return spaceFighterDocks[0];
    
    }
    
    public boolean dockFighter(SpaceFighter falcon1){
        for (int i = 0; i < spaceFighterDocks.length; i ++){
            if (spaceFighterDocks[i] == null){
               spaceFighterDocks[i] = falcon1;
               return true;
            }
        }
        return false;
    }
    
    //assuming we will be deploying the drill docked at index 0
    public Drill deployDrill(){
        return drillDocks[0];
    }
    
    public boolean dockDrill(Drill drill1){
        for (int i = 0; i < drillDocks.length; i ++){
            if (drillDocks[i] == null){
               drillDocks[i] = drill1;
               return true;
            }
        }
        return false;
    }
    
    public boolean addItemToCargohold(String itemname){
        for (int i = 0; i < cargohold.length; i ++){
            if (cargohold[i]== null){
                cargohold[i] = itemname;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeItemFromCargohold(String itemname){
        for (int i = 0; i < cargohold.length; i ++){
            if (cargohold[i].compareTo(itemname)==0){
                cargohold[i] = null;
                
                return true;
            }
        }
        return false;
        
    }
    
    
    public String toString(){
        return "Carrier Space Fighter Docks "+ spaceFighterDocks + 
                "Drill Docks " + drillDocks + 
                "Cargohold " + cargohold;
    }
    
    
    
}
