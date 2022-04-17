/*
Your Task: Write a program that creates a file - Your program should prompt 
the user to enter names of people they know until they type the word "STOP". 
All of these names should be stored in a file in exactly the order they were 
entered.

This file should be named Problem18.txt
 */
import java.io.*;
import java.util.*;
public class Problem18 {
    public static void main(String[] args) throws IOException{
        File file = new File("Problem18.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
            
        }
        
        PrintWriter output = new PrintWriter(file);
        System.out.println("Please enter the names you would like to enter, type STOP if you are done: ");
        Scanner input = new Scanner(System.in);
        String inputVal = input.next();
        while(! inputVal.equals("STOP")){
        output.println(inputVal);
        inputVal = input.next();
        }
        output.close();
    }
    
}
