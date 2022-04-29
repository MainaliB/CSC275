/*
 Complete the method below that uses only the String class and recursion to 
reverse a given string.
 */
public class ReverseString {
    
    
    public void reverse(String s){
        if (s == null || s.length() <=1){
            System.out.println(s);
        }
        else {
            System.out.print(s.charAt(s.length()-1));
            reverse(s.substring(0,s.length()-1));
        }
            
      
    }
    
}
