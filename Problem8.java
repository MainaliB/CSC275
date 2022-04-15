
import java.io.File;
import java.util.*;


/*
There is a file attached that contains multiple lines. On each line 
you will find an integer number. Your task: Read in all of the numbers and 
calculate their mode. The number of lines in the file can change, so you 
should not hard code the length.
 */
public class Problem8 {
    public static void main (String[] args) throws Exception{
        File file = new File("Problem8.txt");
        //int sum = 0; 
        
        int count = 0;
        ArrayList<Integer> numberlist = new ArrayList<>();
        Scanner input = new Scanner(file);
        //input .useDelimiter(", ");
        while(input.hasNextInt()){
            numberlist.add(input.nextInt());
            count += 1;
        }
    input.close();
    Collections.sort(numberlist);
    int modeValue=0;
    int maxCount=0;
    
    for (int i = 0; i < count; i ++){
        int newCount=0;
        for(int j = 0; j < count; j++){
            if (numberlist.get(j)==numberlist.get(i))
                newCount++;
        }
        if (newCount > maxCount){
            maxCount = newCount;
            modeValue = numberlist.get(i);
        }
    }
    System.out.println("The mode is: " + modeValue);
    }
    
}
