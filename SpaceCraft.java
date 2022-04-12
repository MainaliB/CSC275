/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class SpaceCraft {
    private String Name;
    private String Type; // is it a fighter jet, tanker, drill, transporter, or carrier?
    private double Speed;
    
    
    public SpaceCraft(String Name, String Type, double Speed){
        this.Name = Name;
        this.Type = Type;
        this.Speed = Speed;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName( String name){
        Name = name;
    }
    
    
    public String getType(){
        return Type;
    }
    
    public void setType( String type){
        Type = type;
    }
    
    public double getSpeed(){
        return Speed;
    }
    
    public void setSpeed(double value){
        Speed = value;
    }
    
    public String toString(){
        return "SpaceCraft Name: " + Name +
                "\n Type: " + Type +
                "\n Speed: " + Speed;
    
    }
    
    
}
//spacefighter class
class SpaceFighter extends SpaceCraft{
    private boolean cloakingInstalled;
    private boolean fTLInstalled;
    private double damageToInflict;
    private double shield;
    private double defenseMultiplier;
    
    public SpaceFighter(String Name, String Type, double Speed, boolean cloakingInstalled,
            boolean fTLInstalled, double damageToInflict, double shield, double defenseMultiplier){
    
        super(Name, Type, Speed);
        this.cloakingInstalled= cloakingInstalled;
        this.fTLInstalled = fTLInstalled;
        this.damageToInflict= damageToInflict;
        this.shield= shield;
        this.defenseMultiplier=defenseMultiplier;
    
    }
    
    public boolean isCloakingInstalled(){
        return cloakingInstalled;
    }
    
    public boolean isFTLInstalled(){
        return fTLInstalled;
    }
    
    
            
    public double DamageToInflict(){
        return damageToInflict;
    }
    
    public boolean attack(SpaceFighter a){
    double totalDamage = a.damageToInflict * a.getSpeed();
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
        return "SpaceCraft Name: " + getName() +
                "\n Type: " + getType() +
                "\n Speed: " + getSpeed() +
                "\n Cloaking Installed: " + cloakingInstalled +
                "\n FTL Installed: " + fTLInstalled +
                "\n Damage to inflict: " + damageToInflict +
                "\n Shiled: " + shield +
                "\n Defense Multiplier: " + defenseMultiplier;
    
    }
}


//tanker class
class Tanker extends SpaceCraft{
    private double totalCapacity;
    private double oxygenContainer;
    private double waterContainer;
    private double liquidContainer;
    private double gasContainer;
    
    public Tanker(String Name, String Type, double Speed,double totalcapacity, double oxygencontainer, 
            double watercontainer, double liquidcontainer, double gascontainer){
        super(Name, Type, Speed);
        this.totalCapacity = totalcapacity;
        this.oxygenContainer = oxygencontainer;
        this.waterContainer = watercontainer;
        this.liquidContainer= liquidcontainer;
        this.gasContainer = gascontainer;
    
    }
    public boolean addOxygen(double oxygen){
        return true;
    }
    
    public boolean removeOxygen(double oxygen){
        return true;
    }
    
    public boolean addWater(double water){
        return true;
    }
    
    public boolean removeWater(double water){
        return true;
    }
    
    public boolean addLiquid(double liqid){
        return true;
    }
    
    public boolean removeLiquid(double liquid){
        return true;
    }
    
    public boolean addGas(double gas){
        return true;
    }
    
    public boolean removeGas(double gas){
        return true;
    }
    
    public String toString(){
        return "SpaceCraft Name: " + getName() +
                "\n Type: " + getType() +
                "\n Speed: " + getSpeed() +
                "\n Total Capacity: " + totalCapacity +
                "\n Oxygen level: " + oxygenContainer +
                "\n Water level: " + waterContainer +
                "\n Liquid level: " + liquidContainer + 
                "\n Gas level: " + gasContainer;       
    }

}
//transporter class
class Transporter extends SpaceCraft{
    private int cargoCapacity;
    private int personelleCapacity;
    private String[][] cargo;
    private String [] personelle;
    
    
    public Transporter(String Name, String Type, double Speed, int cargocapacity, int personellecapacity){
        super(Name, Type, Speed);
        this.cargo = new String [cargocapacity][cargocapacity];
        this.personelle = new String[personellecapacity];
    }
    public boolean addCargo(String nameItem, double weightItem){
        for (int i = 0; i < cargo.length-1; i++){
            for (int j = 0; j < cargo[0].length; j++){
                if (cargo[i][j] == null){
                    cargo[i][j] = nameItem;
                    cargo[i+1][j] = Double.toString(weightItem);
                    return true;
            }
            
            
            }
            
        }
        return false;
    }
    
    
    public boolean removeCargo(String nameItem){
        for (int i = 0; i < cargo.length-1; i++){
            for (int j = 0; j < cargo[0].length; j++){
                if (cargo[i][j].compareTo(nameItem)== 0){
                    cargo[i][j] = null;
                    cargo[i+1][j] = null;
                    return true;
            }
            
            
            }
            
        }
        return false;
    }
    
    public boolean addPersonelle(String name){
        for (int i = 0; i < personelle.length; i ++){
            if (personelle[i]==null){
                personelle[i]=name;
                return true;
            }
        
        }
        return false;
    
    }
    
    public boolean removePersonelle(String name){
        for (int i = 0; i < personelle.length; i ++){
            if (personelle[i].compareTo(name)==0){
                personelle[i]=null;
                return true;
            }
        
        }
        return false;
    }
    
    public String toString(){
        return "SpaceCraft Name: " + getName() +
                "\n Type: " + getType() +
                "\n Speed: " + getSpeed() +
                "\n Cargo Capacity: " + cargoCapacity;        
    }
}

//drill class
class Drill extends SpaceCraft{
    private double efficiency;
    private double durability;
    private double maxDepth;

    
    public Drill(String Name, String Type, double Speed,double efficiency, double durability, double maxdepth){
        super(Name, Type, Speed);
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
        return "SpaceCraft Name: " + getName() +
                "\n Type: " + getType() +
                "\n Speed: " + getSpeed() +
                "\n Efficiency: " + efficiency+ 
                "\n Durability: " + durability +
                "\n Maximum Depth: " + maxDepth;
    }
}

//carrier class
class Carrier extends SpaceCraft{
    private SpaceFighter [] spaceFighterDocks;
    private Drill [] drillDocks;
    private String [] cargohold;
    
    
    public Carrier (String Name, String Type, double Speed,int numberOfSpaceFighterDocks, int numberOfDrillDocks, int cargoholdSize){
        super(Name, Type, Speed);
        this.spaceFighterDocks = new SpaceFighter[numberOfSpaceFighterDocks];
        this.drillDocks = new Drill[numberOfDrillDocks];
        this.cargohold = new String[cargoholdSize];
    }
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







//Asteroid class
class Asteroid {
    private double goldOre;
    private double silverOre;
    private double platinumOre;
    private double cubicYards;
    
    public Asteroid(){
    }
    
    public Asteroid(double goldore, double silverore, double platinumore, 
            double cubicyards){
        this.goldOre = goldore;
        this.silverOre = silverore;
        this.platinumOre = platinumore;
        this.cubicYards = cubicyards;
    }
    
    public Double getGoldOre(){
        return goldOre;
    }
    
    public boolean mineGoldORe(double number){
        goldOre = getGoldOre()- number;
        cubicYards = getCubicYards() - number;
        
        if (getCubicYards() < 0){
            return false;
        }
        else{
            return true;
        }
        
        
    }
    
    public double getSilverOre(){
        return silverOre;
    }
    
    
    public boolean mineSilverOre(double number){
        silverOre = getSilverOre()- number;
        cubicYards = getCubicYards() - number;
        
        if (getCubicYards() < 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public double getPlatinumOre(){
        return platinumOre;
    }
    
    public boolean minePlatinumOre(double number){
        platinumOre = getPlatinumOre()- number;
        cubicYards = getCubicYards() - number;
        
        if (getCubicYards() < 0){
            return false;
        }
        else{
            return true;
        }
    
    
    }
    public double getCubicYards(){
        return cubicYards;
    }
    
    public String toString(){
        return goldOre + " " + silverOre+ " "+ platinumOre + " "+ cubicYards;
    
    }
}
