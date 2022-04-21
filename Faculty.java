/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Faculty implements Comparable <Faculty>{
    private String FirstName;
    private String LastName;
    private String Department;
    private int UIN;
    
    //default contstructor
    public Faculty(){
    
    }
    //constructor with arguments
    public Faculty(String firstname, String lastname, String department, int uin){
        this.FirstName = firstname;
        this.LastName = lastname;
        this.Department = department;
        this.UIN = uin;
    }
    
    //define methods
    
    public String getFirstName(){
        return FirstName;
    }
    
    public void setFirstName(String word){
        FirstName = word;
    }
    
    
    public String getLastName(){
        return LastName;
    }
    
    public void setLastName(String word){
        LastName = word;
    }
    
    public String getDepartment(){
        return Department;
    }
    
    public void setDepartment(String word){
        Department = word;
    }
    
    public int getUIN(){
        return UIN;
    }
    
    public void setUIN(int number){
        UIN = number;
    }
    
    public String toString(){
        return FirstName + " "+ LastName + " "+ Department +" "+ UIN;
        
    }
    public int compareTo(Faculty a){
        if (getUIN() > a.getUIN())
            return 1;
        else if (getUIN()< a.getUIN())
            return -1;
        else 
            return 0;
        
    }
    
    public boolean equals(Faculty a){
        
    }
    
    
}
