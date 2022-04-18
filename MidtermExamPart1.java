/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class MidtermExamPart1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 7, 10, 17};

        int [] result = processArray(myArray);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        
    }
    
    public static int[] processArray(int[] myArray) {
        int sum = 0;
        int [] result = new int [3];
        //ArrayList <Integer> result = new ArrayList<>();
        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            
        }
        result[0]=(sum);
        
        int sizeArray = myArray.length;
        int sum1 = 0;
        int sum2 = 0;
        int finalSum=0;
        if (sizeArray %2 != 0){
            for (int i = 0; i < sizeArray / 2; i++){
                sum1+= myArray[i];
            }
            for (int i = (sizeArray / 2) + 1; i < sizeArray; i ++){
                sum2 += myArray[i];
            }
            finalSum = sum1 + sum2;
        }
        else{
            for (int i = 0; i < sizeArray / 2; i++){
                sum1+= myArray[i];
            }
            for (int i = (sizeArray / 2); i < sizeArray; i ++){
                sum2 += myArray[i];
            }
            finalSum = sum1 + sum2;
            
        
        }
        
        result[1]=(finalSum);
        int index=0;
        ArrayList<Integer> result1 = new ArrayList<>();
        for (int i = 0; i < myArray.length; i ++){
            if (myArray[i]==7){
                result1.add(i);
            }
            else {
                result1.add(-1);
            }
        
        }
        Collections.sort(result1);
        
        
        
        result[2]=(result1.get(result1.size()-1));
        
        
        return result;
    }
    
}
