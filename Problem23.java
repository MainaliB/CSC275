
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
Your Task: Your program should ask users for the name of a product, and a quantity
for that product. Save the information to a file with all of the product names
on one line separated by commas, and all of the quantities on the next line (in 
the same order) separated by commas.

This file should be named Problem23.txt

Note: Your program should handle all types of inputs without crashing.


 */
public class Problem23 {
    public static void main(String[] args) throws IOException{
        File file = new File("Problem23.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }
        
        PrintWriter output = new PrintWriter(file);
        
        
        Scanner input = new Scanner(System.in);
        //ArrayList <String> myArray = new ArrayList<>();
       String myProduct = "";
        ArrayList <Integer> myNumber = new ArrayList<>();
        
        System.out.println("Please enter the name of a product, enter STOP when done:");
        
        while (! input.next().equals("STOP")){
            myProduct = myProduct + input.next() + ",";
            
            System.out.println("Please enter the quantity for the product: ");
            
            myNumber.add(input.nextInt());
            
        }
        
        output.println(myProduct);
        
        for (int i = 0; i < myNumber.size(); i ++){
            output.print(myNumber.get(i)+ ",");
        }
        output.close();
        
    }
        
        
        
    
    
}
