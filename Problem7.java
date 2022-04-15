
import java.io.File;
import java.util.*;

/*
 There is a file attached that contains multiple lines. On each line you 
will find an integer number. Your task: Read in all of the numbers and calculate
their median. The number of lines in the file can change, so you should not hard 
code the length.
 */
public class Problem7 {
    public static void main (String[] args) throws Exception{
        File file = new File("Problem7.txt");
        //int sum = 0; 
        double median;
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
    if (count %2 ==0){
        median = (numberlist.get(count/2) + numberlist.get(count/2 - 1))/2;
       
    }
    else {
        median = numberlist.get((count-1)/2);
    
    }
    System.out.println("The median is: " + median);
    }
    
    
}
