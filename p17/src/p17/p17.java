package p17;
import java.util.Scanner;
import java.util.Arrays;
class p17{
    public static void main(String... args) {
        int p=1,n,m;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter size of magic board:");
        n = a.nextInt();
        int[][] ar = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            ar[i][j]=0;
        }
        while(p!=0){
            System.out.println("press 1 for row query:");
            System.out.println("press 2 for column query:");
            System.out.println("press 3 for row operation:");
            System.out.println("press 4 for column operation:");
            int b = a.nextInt();
            int l=0;
            if(b==1){
                System.out.print("Enter row no:");
                m = a.nextInt();
                for(int i=0;i<n;i++)
                if(ar[i][m-1]==0)
                l+=1;
                System.out.println("No of zeors = "+l);
            }
            if(b==2){
                System.out.print("Enter column no:");
                m = a.nextInt();
                for(int i=0;i<n;i++)
                if(ar[m-1][i]==0)
                l+=1;
                System.out.println("No of zeors = "+l);
            }
            if(b==3){
                System.out.print("Enter row no:");
                m = a.nextInt();
                for(int i=0;i<n;i++)
                    ar[i][m-1]=1;
            }
            if(b==4){
                System.out.print("Enter column no:");
                m = a.nextInt();
                for(int i=0;i<n;i++)
                    ar[m-1][i]=1;
            }

            System.out.print("press 0 for exit:");
            p = a.nextInt();
            System.out.println();
        }
        System.out.println();
    }
}