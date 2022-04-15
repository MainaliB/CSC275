
import java.io.File;
import java.util.Scanner;

/*
There is a file attached that contains multiple lines. On each line you will find a word

Your task: Read in all of the words and calculate how many times the letter 'a' appears.
 */
public class Problem9 {
    public static void main (String[] args) throws Exception{
    File file = new File("Problem9.txt");
            
    Scanner input = new Scanner(file);
    int count = 0;
    while(input.hasNext()){
        String value = input.next();
        for (int i = 0; i < value.length();i++){
            if(value.charAt(i)=='a')
                count+=1;
        }
            
            
            
        }
    input.close();
    System.out.println("The total number of a is: " + count);
    }
        
    
}
