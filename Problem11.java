
import java.io.File;
import java.util.*;

/*
There is a file attached that contains multiple lines. On each line you will 
find either an integer or a word. 

Your task: Read in all of the integers and count their sum. 
You should properly detect the difference between a word and an integer - 
without your program crashing.
 */
public class Problem11 {
    public static void main (String[] args) throws Exception{
    File file = new File("Problem11.txt");
            
    Scanner input = new Scanner(file);
    int sum = 0;
    while(input.hasNext()){
        try {
           int val = input.nextInt();
           sum += val;
        
        }
        catch(InputMismatchException ex){
            input.nextLine();
            
        }
    
    
    
    }
    input.close();
    
    System.out.println("The sum is " + sum);
}
}
