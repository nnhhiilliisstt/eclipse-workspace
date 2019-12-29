package stngbfn;
import java.io.*; 
import java.util.*;

public class stnbfn{

    public static void main(String... args) {
        StringBuilder s = new StringBuilder("abcba");
        System.out.println("string ="+ s);
        String k = s.toString();
        s.reverse();
        System.out.println("reverse string ="+ s);
        String k1 = s.toString(); 
        System.out.println("Palindrome ="+k.equals(k1));  
        System.out.println("uppercase ="+k.toUpperCase());
        System.out.println("lowercase ="+k.toLowerCase());
        String k2 = "kumar";
        System.out.println("Second string= "+k2);
        System.out.println("Equality ="+k.equals(k2));
        s.reverse();
        s.insert(3, true);
        System.out.println("insert true at 3rd =" + s);
        s.delete(3,7);
        System.out.println("after deleting 3 to 7 ="+ s);
        System.out.println("Contains sequence: " + k.contains("a"));
        System.out.println("Contains sequence: " + k.contains("ab"));
        int i = k.indexOf("ab");
        System.out.println("index of first ab ="+i);
        i = k.lastIndexOf('a');
        System.out.println("index of last a ="+i);
        char char_at = s.charAt(4); 
        System.out.println("Character at specific location: " +char_at);
        char c = 'f';
        int index = 2;
        String str = k.substring(0, index) + c + k.substring(index + 1); 
        System.out.println("Modified String = "+ str);
        String ch = "f"; 
        str = str.replaceAll(ch, " "); 
        str = str.trim();
        System.out.println("Modified String = "+ str);
        int var1 = k.compareTo( k1 );
       System.out.println("comparison Lexicographically: "+var1);

       String[] tokens = k.split("b"); 
       System.out.println("Splitting of string "+Arrays.toString(tokens));
    }
}