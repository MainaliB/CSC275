
import java.math.BigInteger;

/*
For this problem you will accept a single BigInteger value. This number can 
potentially get VERY large, so we don't want to just use Integer. 
You can find documentation about BigInteger here: 
https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html 
(Links to an external site.)

If the number passed into our recursive method is even, pass half of that value 
back into our method. If the number passed in is odd then multiply it by 3,
add one, and then pass it back into our method.

Our method will only stop executing if the value passed into our method is a 1.

For full credit, keep track of how many times through this method it takes 
for the original number passed in to reach 1. This can be maintained in 
a class level variable that can be incremented within your method.
 */
public class BouncingNumber {
    
    
    
    static int count = 0;  
    
    public static void main(String [] args){
        BouncingNumber a = new BouncingNumber();
        a.bouncingNumber(new BigInteger("123456789654123") );
    }
    public void bouncingNumber(BigInteger value){
        count ++;
        if ( value == BigInteger.ONE){
            return;
        }
        else if ((value.remainder(new BigInteger("2"))).equals(BigInteger.ZERO)){
            
            bouncingNumber(value.divide(new BigInteger("2")));
            //bouncingNumber(value);
            
        
        }
        else {
            
            bouncingNumber(value.multiply(new BigInteger("3")).add(BigInteger.ONE));
            //value = value.divide(new BigInteger("2"));
            //bouncingNumber(value);
            
             //bouncingNumber(value.multiply(new BigInteger("3")).add(BigInteger.ONE));
             
            
        }
            
       System.out.println(count);
    }
    
    
    
    
}
