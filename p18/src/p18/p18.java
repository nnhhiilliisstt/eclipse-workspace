package p18;
import java.util.Scanner;
class p18 {
    public static char[][] arr = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    public static int j = 0,i=1;
    public static int p18() { 
        if( arr[0][0]==arr[0][1] && arr[0][2]==arr[0][1] ||
            arr[1][0]==arr[1][1] && arr[1][2]==arr[1][1] ||
            arr[2][0]==arr[2][1] && arr[2][2]==arr[2][1] ||
            arr[0][0]==arr[1][0] && arr[1][0]==arr[2][0] ||
            arr[0][1]==arr[1][1] && arr[2][1]==arr[1][1] ||
            arr[0][2]==arr[1][2] && arr[1][2]==arr[2][2] ||
            arr[0][0]==arr[1][1] && arr[2][2]==arr[1][1] ||
            arr[0][2]==arr[1][1] && arr[2][0]==arr[1][1] )
            return i;
            else
            return j;
    }    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int m=0;
        while(m!=9)
        {
            System.out.print("player 1:");
            int f=s.nextInt();
            arr[(f-1)/3][(f-1)%3]='0';
            for(int i=0;i<3;i++)
            {
            for(int j=0;j<3;j++)
            System.out.print(arr[i][j]+" ");
            System.out.print("\n");
            }
            m=m+1;
            int l=p18();
            if(l==1){
                System.out.println("Player 1 win");
            m=9;
            break;
            }
            else if(m==9){
                System.out.println("match draw");
                break;
                }
            System.out.print("player 2:");
             f=s.nextInt();
            arr[(f-1)/3][(f-1)%3]='*';
            for(int i=0;i<3;i++)
            {
            for(int j=0;j<3;j++)
            System.out.print(arr[i][j]+" ");
            System.out.print("\n");
            }
            m=m+1;
            l=p18();
            if(l==1){
                System.out.println("Player 2 win");
             m=9;
             break;
            }
        }
    }
}