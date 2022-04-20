
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/*
Your Task: Your program should ask the user for positive integers until they
enter the number 0. All of these integers should be stored in a file in 
ascending order (0-N)

This file should be named Problem22.txt
 */
public class Problem22 {
    public static void main(String[] args) throws IOException{
        File file = new File("Problem22.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
            
        }
        PrintWriter output = new PrintWriter(file);
        System.out.println("Please enter a positive number: ");
        Scanner input = new Scanner(System.in);
        int inputVal = input.nextInt();
        ArrayList <Integer> myNumber = new ArrayList<>();
        while ( inputVal!=0){
            myNumber.add(inputVal);
            
            inputVal = input.nextInt();
            
        }
        Collections.sort(myNumber);
        
        for (int i = 0; i < myNumber.size(); i++){
        output.println(myNumber.get(i));
        }
        output.close();
    
}
    
}
