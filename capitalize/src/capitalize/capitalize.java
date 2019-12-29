package capitalize;
import java.util.Scanner;
public class capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String s = sc.nextLine();
        String[] ar = s.split(" ");
        for(int i=0;i<ar.length;i++){
            s = (ar[i].charAt(0)+"").toUpperCase();
            ar[i] = s + ar[i].substring(1);
        }
        for(String i:ar)
        System.out.print(i+" ");
    }
}