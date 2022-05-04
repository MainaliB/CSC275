/*
Given a list of integers L and a target integer T return true or false if there
exists a sublist of integers whose sum is equal to T.

For this particular problem, both positive and negative numbers are 
allowed.  To keep things simple, we will assume 0 is not allowed and that 
T cannot be 0. 
 */
public class SumComplements {
    
    public boolean checkSum(int[] L, int T){
       int start = 0;
       int numToFind = T - L[start];
       for(int i = start + 1; i < L.length; i++){
           if (L[i]== numToFind)
                   return true;
       }
       start ++;
       boolean result = checkSum(L, T);
       
       
       
       return result;
       }
        
       
    
    
    }
    

