package countsequence;
import java.util.Scanner;
public class countsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String k = sc.nextLine();
        System.out.print("Enter char:");
        String s = sc.next();
        int j =0;
        for(int i=0;i<k.length();i++)
        if((k.charAt(i)+"").equals(s))
        j+=1;
        System.out.println(j);
    }
}