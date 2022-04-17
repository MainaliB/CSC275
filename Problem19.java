/*
Your Task: Write a program that creates a file - Your program should ask the 
user for positive integers until they enter the number 0. All of these integers 
should be stored in a file in the order they were entered. The last line of the 
file should contain the sum total of all integers that have been entered.

This file should be named Problem19.txt
 
 */
import java.io.*;
import java.util.*;
public class Problem19 {
    public static void main(String[] args) throws IOException{
        File file = new File("Problem19.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
            
        }
        PrintWriter output = new PrintWriter(file);
        System.out.println("Please enter a positive number: ");
        Scanner input = new Scanner(System.in);
        int inputVal = input.nextInt();
        int sum = 0;
        while ( inputVal!=0){
            output.println(inputVal);
            sum += inputVal;
            inputVal = input.nextInt();
            
        }
   
        output.println(sum);
            
        
        output.close();
    
}
}
