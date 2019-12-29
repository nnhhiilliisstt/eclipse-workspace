package remainingoccurence;
import java.util.Scanner;
public class remainingoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String k = sc.nextLine();
        System.out.print("Enter char:");
        String s = sc.next();
        int i = k.indexOf(s);
        i = i + s.length();
        for(int j=i;j<k.length();j++)
        System.out.print(k.charAt(j));
        System.out.println();
    }
}