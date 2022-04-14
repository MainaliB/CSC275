
import java.io.File;
import java.util.Scanner;

/*
There is a file attached that contains multiple lines. On each line you will
find a decimal number. Your task: Read in all of the numbers and calculate 
their average. The number of lines in the file can change, so you should not
hard code the length.
 */
public class Problem6 {
    public static void main (String[] args) throws Exception{
        File file = new File("Problem6.txt");
        double sum = 0; 
        int count = 0;
        Scanner input = new Scanner(file);
        //input .useDelimiter(", ");
        while(input.hasNextDouble()){
            sum += input.nextDouble();
            count += 1;
        }
    input.close();
    System.out.println(sum/count);
    }
    
}
