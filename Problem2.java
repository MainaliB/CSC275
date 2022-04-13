/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
import java.io.*;
public class Problem2 {
    public static void main (String[] args) throws Exception{
        File file = new File("Problem2.txt");
        int sum = 0;        
        Scanner input = new Scanner(file);
        input .useDelimiter(", ");
        while(input.hasNextInt()){
            sum += input.nextInt();
        }
    input.close();
    System.out.println(sum);
    }
    
}
