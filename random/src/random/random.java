package random;
import java.util.Arrays;

public class random {
    public static void main(String... args){
        double[] ar = new double[100];
        for(int i=0;i<100;i++)
            ar[i]=Math.ceil((Math.random())*100.0);
        System.out.println("Before sorted:");
        for(double i:ar)
        System.out.print(i+"  ");
        System.out.println();
        Arrays.sort(ar);
        System.out.println("After sorted:");
        for(double i:ar)
        System.out.print(i+"  ");
        System.out.println();
    }
}