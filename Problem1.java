/*
 There is a file attached that contains multiple lines. On each line is a number that I have generated randomly. 

Your task: Create a program that reads each line of this file, and prints out the sum of all numbers included
 */
import java.util.*;
import java.io.*;
public class Problem1 {
    public static void main (String[] args) throws Exception{
        File file = new File("Problem1.txt");
            
    Scanner input = new Scanner(file);
    
    while(input.hasNextInt()){
        int Number = input.nextInt();
        System.out.println(Number);
        
    }
    input.close();
    
    }
    
    
}
