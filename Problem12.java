
import java.io.File;
import java.util.*;


/*
There is a file attached that contains multiple lines. On each line you will 
find either an integer or a word. 

Your task: Count how many unique words are listed in the file.
You should properly detect the difference between a word and an integer 
- without your program crashing.
 */
public class Problem12 {
    public static void main (String[] args) throws Exception{
    File file = new File("Problem12.txt");
         
    Scanner input = new Scanner(file);
    
    ArrayList<String> myArray = new ArrayList<>();
    ArrayList<Integer> myArray2 = new ArrayList<>();
    while(input.hasNext()){
        String val = input.next();
       
        
        
        try {
           myArray2.add(Integer.parseInt(val));
           
           
        
        }
        catch(NumberFormatException ex){
            
            myArray.add(val);
            
        }
    
    
    
    }
    
    input.close();
    
    
    ArrayList<String> newList = new ArrayList<>();
    for(String eachword:myArray){
        if (!newList.contains(eachword)){
            newList.add(eachword);
        }
    }
    System.out.println("The number of unique items is " + newList.size()); 
    
}
    
}
