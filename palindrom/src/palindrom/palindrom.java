package palindrom;
import java.util.Scanner;
public class palindrom {
	
public static void main(String[] args) {
	
 Scanner in = new Scanner(System.in);
 System.out.println("INPUT A NUMBER:");
 int n = in.nextInt();
 int sum = 0, r;
 int temp = n;    
 while(n>0)
   {    
    r = n % 10;   
    sum = (sum*10)+r;    
    n = n/10;    
   }    
  if(temp==sum)
	  System.out.println("THE GIVEN NUMBER IS A PALINDROME");
  else
	  System.out.println("THE GIVEN NUMBER IS NOT PALINDROME");
      
	
	
	
	
	
	
	

}
}