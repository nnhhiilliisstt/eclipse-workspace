package bigdecimals;
import java.math.BigDecimal;
public class bigdecimals {
	
	public static void main(String[] args) {
	
	BigDecimal bd1 = new BigDecimal("1234567899.475348573689");
	BigDecimal bd2 = new BigDecimal("45475894357958.58349534085");
	
	bd1 = bd1.add(bd2); 
    System.out.println("BigDecimal1 = " + bd1); 
    
    bd1 = bd1.multiply(bd2); 
    System.out.println("BigDecimal1 = " + bd1); 

    bd1 = bd1.subtract(bd2); 
    System.out.println("BigDecimal1 = " + bd1); 

    bd1 = bd1.divide(bd2); 
    System.out.println("BigDecimal1 = " + bd1);
		
		
	}

}
