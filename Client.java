/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Client implements Comparable <Client> {
    private String FirstName;
    private String LastName;
    private int SocialSecurityNumber;
    
    
    public Client(){
    }
    
    public Client(String firstname, String lastname, int socialsecuritynumber){
        this.FirstName = firstname;
        this.LastName = lastname;
        this.SocialSecurityNumber = socialsecuritynumber;
    }
    
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
    
    public int getSocialSecurityNumber(){
        return SocialSecurityNumber;
    }
    
    public void setSocialSecurityNumber(int number){
        SocialSecurityNumber = number;
    }
    
    public String toString(){
        return FirstName + " "+ LastName +" "+  SocialSecurityNumber;// fix this
    }
    
}
