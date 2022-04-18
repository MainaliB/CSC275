/*
 Your Task: Your program should ask for the path of a directory. Once this path
is received you should print out all a list of all subdirectories.

This file should be named Problem26.txt

Note: Your program should handle all types of inputs without crashing.
 */

import java.io.*;

import java.util.*;

public class Problem26 {
    public static void main(String [] args) throws IOException{
        File file = new File("Problem26.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
            
        }
        
        PrintWriter output = new PrintWriter(file);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the path of a directory: ");
        File path = new File (input.next());
        String [] contents = path.list(new FilenameFilter(){
            @Override
            public boolean accept(File current, String name) {
            return new File(current, name).isDirectory();
            }
        });
        
        for (int i = 0; i < contents.length; i++){
            output.println(contents[i]);
        
        }
        
        
        output.close();
     
    }
    
}
