/*
Complete the method below that uses only the String class and recursion to 
determine if a String is a palindrome.
 */
public class PalindromeChecker {
    
    public void palindromeChecker(String s){
        if (s.length()<=1){
            System.out.println("True");
        }
        else if (s.charAt(0) != s.charAt(s.length()-1)){
            System.out.println("False");
        }
        else
            palindromeChecker(s.substring(1,s.length()-1));
    
    }
    
}
