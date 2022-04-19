
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Your Task: Your program should ask for the path of a directory. 
Once this path is received you should print out a combined list of all 
subdirectories followed by all files.


This file should be named Problem28.txt

Note: Your program should handle all types of inputs without crashing.
 */
public class Problem28 {public static void main(String [] args) throws IOException{
        File file = new File("Problem28.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
            
        }
        
        PrintWriter output = new PrintWriter(file);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the path of a directory: ");
        File path = new File (input.next());
        String [] contentsDirectory = path.list(new FilenameFilter(){
            @Override
            public boolean accept(File current, String name) {
            return new File(current, name).isDirectory();
            }
        });
        
        String [] contentsFiles = path.list(new FilenameFilter(){
            @Override
            public boolean accept(File current, String name) {
            return new File(current, name).isFile();
            }
        });
        
        for (int i = 0; i < contentsDirectory.length; i++){
            output.println(contentsDirectory[i]);
        
        }
        
        for (int i = 0; i < contentsFiles.length; i++){
            output.println(contentsFiles[i]);
        
        }
        
        
        output.close();
     
    }
    
}
