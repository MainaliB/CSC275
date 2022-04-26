/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Staff implements Comparable <Staff>{
    private String FirstName;
    private String LastName;
    private String Department;
    private String Title;
    private int UIN;
    
    //default contstructor
    public Staff(){
    
    }
    //constructor with arguments
    public Staff(String firstname, String lastname, String department,String title, int uin){
        this.FirstName = firstname;
        this.LastName = lastname;
        this.Department = department;
        this.Title = title;
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
    
    public String getTitle(){
        return Title;
    }
    
    public void setTitle(String word){
        Title = word;
    }
    
    public int getUIN(){
        return UIN;
    }
    
    public void setUIN(int number){
        UIN = number;
    }
    
    public String toString(){
        return FirstName + " "+LastName +" "+ Department + " "+ Title + " " + UIN;
        
    }
    
    public int compareTo(Staff a){
        if (getUIN() > a.getUIN())
            return 1;
        else if (getUIN()< a.getUIN())
            return -1;
        else 
            return 0;
        
    }
    
    public boolean equals(Staff a){
        
        if (this.Title == a.getTitle())
            return true;
        else
                return false;
        
    }
        
    }
    
    
}
