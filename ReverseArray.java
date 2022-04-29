/*
Given an array of integers use recursion to reverse the entire list. 
You should only use recursion and you should not create a second array.
 */
public class ReverseArray {
    
    public void reverseArray(int[] myArray){
        if (myArray.length == 0)
            return;
        
        else{
            reverse(myArray, 0, myArray.length-1);
        }
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }        
        
    }
    public void reverse(int [] a, int start, int end){
        if (start>= end)
            return;
        
        int temp = a[start];
        a[start]= a[end];
        a[end]=temp;
        reverse(a, start+1, end-1);
    }
    
        

}
