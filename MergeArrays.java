/*
 Given two arrays that are full of integers, recursively merge these two arrays 
into one large array. The large array should have items from the first array in
even indices (0,2,4 ...) and items from the second array in odd indices (1,3,5 
...). Only use recursion to complete this task.
 */
public class MergeArrays {
    
    public void mergeArrays(int[] arrayOne, int[] arrayTwo, int[] mergedArray){
        merge(arrayOne, 0, mergedArray, 0);
        merge(arrayTwo, 0, mergedArray, 1);
        
    
    
    }
    public int [] merge(int[] arrayOne, int startArrayOne, int[] mergedArray, int startMergedArray){
        if (arrayOne.length <= startArrayOne ){
            return mergedArray;
        }
        else
            
            mergedArray[startMergedArray]= arrayOne[startArrayOne];
            startArrayOne++;
            startMergedArray = startMergedArray + 2;
            merge(arrayOne, startArrayOne, mergedArray, startMergedArray);
            return mergedArray;
        
    }
}
