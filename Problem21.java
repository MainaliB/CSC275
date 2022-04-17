
import java.io.*;
import java.util.*;

/*
 Your Task: Write a program that creates a file - Your program should request 
the user to enter strings until they type the word "STOP". You should then sort 
these strings in alphabetical order (A-Z) and save them to a file.

This file should be named Problem21.txt
 */
public class Problem21 {
    public static void main(String[] args) throws IOException{
        File file = new File("Problem21.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
            
        }
        PrintWriter output = new PrintWriter(file);
        System.out.println("Please enter words, enter STOP when done: ");
        Scanner input = new Scanner(System.in);
        String inputVal = input.next();
        ArrayList <String> myArray = new ArrayList<>();
        while ( !inputVal.equals("STOP")){
            myArray.add(inputVal);
            
            inputVal = input.next();
            
        }
        Collections.sort(myArray);
        
        for (int i = 0; i < myArray.size(); i++){
        output.println(myArray.get(i));
        }
        output.close();
    
}
    
}
