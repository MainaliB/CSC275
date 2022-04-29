/*
Write a program that that recursively traverses an array of integers and returns
the total sum of all integers in the list.
 */
public class Summation {
    public int recursiveSummation(int [] myArray){
       
        if (myArray.length <=0){
            return 0;
        }
        else
            return recursiveInternal(myArray,myArray.length-1);
    
    }
    private int recursiveInternal(int A[],int length){

        if(length ==0 ){
    
            return 0;
        }
        else{
            return A[length]+recursiveInternal(A, length-1);
        }
    }
    
}
