
import java.io.File;
import java.util.Scanner;

/*
 There is a file attached that contains multiple lines. On each line is a word

Your task: Take each line of the file and place it inside of an array of the
correct length. The array should hold only Strings. You should determine the 
length of your array by programmatically counting the lines in the file (the 
length will change based on the tests that I run)
 */
public class Problem5 {
    public static void main (String[] args) throws Exception{
        File file = new File("Problem5.txt");
            
        Scanner input = new Scanner(file);
        
        int count = 0;
        while(input.hasNext()){
            count += 1;
        
        }
        
        String [] myArray = new String [count];
        for (int i = 0; i < count; i++){
            myArray[i] = input.next();
            //System.out.println(input.next());
        
        }
        input.close();
        //System.out.print(myArray);
     
        
     for (int i = 0; i < count; i++){
         System.out.println(myArray[i]);
     }   
    }
    
}

