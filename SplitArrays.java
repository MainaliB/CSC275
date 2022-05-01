/*
 Given one array that is filled with random integers, split this large array 
iinto two equal sized smaller arrays. Use only recursion to perform this task. 
All items at even indices in the large array should be put in array one, and 
all items at the odd indices in the large array should be put in array two.
 */
public class SplitArrays {
    
    
    public void splitArrays(int[] largeArray, int[] arrayOne, int[] arrayTwo){
        
        
    }
    
    public void split(int[] arrayOne, int startArrayOne, int [] largeArray, int startLargeArray ){
        if (startArrayOne >= arrayOne.length)
            return;
        else
            arrayOne[startArrayOne] = largeArray[startLargeArray];
            startArrayOne ++;
            startLargeArray = startLargeArray + 2;
            split(arrayOne, startArrayOne, largeArray, startLargeArray);
    }

    
}
