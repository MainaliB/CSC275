/*
Given a long string use recursion to traverse the string and replace 
every vowel (A,E,I,O,U) with an @ sign. 
 */
public class EncodeVowels {
    
    
    public String encodeVowels(String s){
        // Base Case
        if(s.length()==0){
            return "";
        } 
        else {
            char first = s.charAt(0);
            
            if(first=='A' || first=='E' || first=='I' || first=='O' || first=='U') {
                
                return '@' + encodeVowels(s.substring(1, s.length()));
            } 
            else { // if the first letter is not a vowel
                // recursive call the function, and return the result
                return first + encodeVowels(s.substring(1, s.length()));
            }
        }
    }
}
