package sbsB;
import java.io.*; 

public class sbsB {
	public static void main(String[] args) 
	{ 
        StringBuilder s = new StringBuilder("ADITYA"); 
		int p = s.length(); 
        int q = s.capacity(); 
        System.out.println("string =" + s);
		System.out.println("Length of string =" + p); 
        System.out.println("Capacity of string =" + q); 
        s.append(1);
         p = s.length(); 
         q = s.capacity();
         System.out.println("after adding 1");         
        System.out.println("Length of string =" + p); 
        System.out.println("Capacity of string =" + q); 
        s.reverse();
        System.out.println("reverse string =" + s);
        s.insert(3, true);
        System.out.println("insert true at 3rd =" + s);
        s.delete(2,5);
        System.out.println("after deleting 2 to 4 ="+ s);
    
        
	} 
} 