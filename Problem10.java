
import java.io.File;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Problem10 {
    public static void main (String[] args) throws Exception{
    File file = new File("Problem10.txt");
            
    Scanner input = new Scanner(file);
    int count = 0;
    while(input.hasNext()){
        String value = input.next();
        for (int i = 0; i < value.length()-1;i++){
            if((value.charAt(i)=='r')&&(value.charAt(i+1)=='e'))
                count+=1;
        }
            
            
            
        }
    input.close();
    System.out.println("The total number of re is: " + count);
    }
        
    
}
