
import java.io.File;
import java.util.Scanner;

/*
There is a file attached that contains multiple lines. On each line
is a word (or at least close to it)

Your task: Prompt the user for a 
large word that possibly contains one of the words in the document. 
Read each line of the file until you either find a word contained within 
the word the user entered, or reach the end of the file. If you find the 
word print out "Word Found!", if the word was not found in the list print 
out "Word Not Found!"
 */
public class Problem4 {
    public static void main (String[] args) throws Exception{
        File file = new File("Problem4.txt");
            
    Scanner input = new Scanner(file);
    System.out.println("Please enter a word: ");
    Scanner inputFromUser = new Scanner(System.in);
    String userInput = inputFromUser.next();
    String valueToPrint="";
    while(input.hasNext()){
        String value = input.next();
        if (userInput.contains(value)){
            valueToPrint = "Word Found!";
            
            break;
        
        }
        else{
            valueToPrint = "Word Not Found!";
        }
        
    }
    System.out.println(valueToPrint);
    input.close();
    
    
}
}
