/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Account {
    private Client AccountHolder;
    private Double Balance;
    private Date DateCreated;
    
    public Account(){
    
    }
    
    public Account(Client accountholder, double balance){
        this.AccountHolder = accountholder;
        this.Balance = balance;
        DateCreated = new Date();
    
    }
    
    public Client getAccountHolder(){
        return AccountHolder;
    }
    
    public void setAccountHolder(Client word){
        AccountHolder = word;
    }
    
    
    public double getBalance(){
        return Balance;
    }
    
    public double deposit(double number){
        return (Balance + number);
        
    }
    
    public double withdraw(double number){
        if(Balance > number){
            Balance = Balance - number;
            
        }
        return Balance;
    }
    public Date getDateCreated(){
        DateCreated = new Date();
        return DateCreated;
    }
    
    public String toString(){
        return AccountHolder + " " +Balance + " "+ DateCreated; //fix it
    }
    
    
}
