/*
 Complete the method below that returns the result of a factorial using 
only recursion.c
 */
public class Factorial {
    
    public int factorial(int n){
        
        if (n ==0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
                
    
    }
    
}
