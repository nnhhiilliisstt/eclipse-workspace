package capitalizeodd;
import java.util.Scanner;
public class capitalizeodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String s = sc.nextLine();
        String[] ar = s.split(" ");
        int p=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length();j++){
                if(p%2==0){
                s = (ar[i].charAt(j)+"").toUpperCase();
                System.out.print(s);
                }
                else{
                    System.out.print(ar[i].charAt(j));
                }
                p+=1;
            }
            System.out.print(" ");
    }
    System.out.println();
    }
}