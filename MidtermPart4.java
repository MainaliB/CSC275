
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
public class MidtermPart4 {
    public static void main (String[] args) throws Exception{
    File file = new File("Part4.txt");
            
    Scanner input = new Scanner(file);
    int count = 0;
    while(input.hasNext()){
        String value = input.next();
        for (int i = 0; i < value.length();i++){
            if(value.charAt(i)=='a')
                count+=1;
        }
            
            
            
        }
    input.close();
    System.out.println("The total number of a is: " + count);
    }
    
}
