package biginteger;
import java.math.BigInteger;
public class biginteger {
	
	public static void main(String[] args) {
	
	BigInteger bi1 = new BigInteger("1234567899475348573689");
	BigInteger bi2 = new BigInteger("4547589435795858349534085");
	
	bi1 = bi1.add(bi2); 
    System.out.println("BigInteger1 = " + bi1); 
    
    bi1 = bi1.multiply(bi2); 
    System.out.println("BigInteger1 = " + bi1); 

    bi1 = bi1.subtract(bi2); 
    System.out.println("BigInteger1 = " + bi1); 

    bi1 = bi1.divide(bi2); 
    System.out.println("BigInteger1 = " + bi1);
		
		
	}

}
