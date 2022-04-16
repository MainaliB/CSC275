
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
There is a file attached that contains multiple lines. On each alternating 
line you will find a double and then a boolean. 

Your task: Sum all doubles that are followed by a true value, 
and ignore all values that are followed by a false value.
 */
public class Problem13 {
    public static void main (String[] args) throws Exception{
    File file = new File("Problem13.txt");
         
    Scanner input = new Scanner(file);
    ArrayList<Double> myArray = new ArrayList<>();
    ArrayList<Boolean> myArray2 = new ArrayList<>();
    while(input.hasNext()){
        String val = input.next();
       
        
        
        try {
           myArray2.add(Boolean.parseBoolean(val));
           
           
        
        }
        catch(NumberFormatException ex){
            
            myArray.add(Double.parseDouble(val));
            
        }
        
        
    }
    
    
    }
    
}
