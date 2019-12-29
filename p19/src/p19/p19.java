package p19;
import java.util.Random; 
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.List; 
class p19{    
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
        List<Integer> list = new ArrayList<>();
		for(int i=1;i<=9;i++)
		list.add(i);
        Random rand = new Random(); 
        while(m!=9)
        {
            int f;
            if(arr[0][0]==arr[0][1] && list.contains(3))
            f=3;
            else if(arr[0][0]==arr[0][2]  && list.contains(2))
            f=2;
            else if(arr[0][1]==arr[0][2]  && list.contains(1))
            f=1;
            else if(arr[1][0]==arr[1][1]  && list.contains(6))
            f=6;
            else if(arr[1][0]==arr[1][2]  && list.contains(5))
            f=5;
            else if(arr[1][1]==arr[1][2]  && list.contains(4))
            f=4;
            else if(arr[2][1]==arr[2][2]  && list.contains(7))
            f=7;
            else if(arr[2][0]==arr[2][2]  && list.contains(8))
            f=8;
            else if(arr[2][0]==arr[2][1]  && list.contains(9))
            f=9;
            else if(arr[0][0]==arr[1][0]  && list.contains(7))
            f=7;
            else if(arr[1][0]==arr[2][0]  && list.contains(1))
            f=1;
            else if(arr[0][0]==arr[2][0]  && list.contains(4))
            f=4;
            else if(arr[1][1]==arr[2][1]  && list.contains(2))
            f=2;
            else if(arr[0][1]==arr[2][1]  && list.contains(5))
            f=5;
            else if(arr[0][1]==arr[1][1]  && list.contains(8))
            f=8;
            else if(arr[2][2]==arr[1][2]  && list.contains(3))
            f=3;
            else if(arr[0][2]==arr[2][2]  && list.contains(6))
            f=6;
            else if(arr[0][2]==arr[1][2]  && list.contains(9))
            f=9;
            else if(arr[1][1]==arr[2][2]  && list.contains(1))
            f=1;
            else if(arr[0][0]==arr[2][2]  && list.contains(5))
            f=5;
            else if(arr[0][0]==arr[1][1]  && list.contains(9))
            f=9;
            else if(arr[2][0]==arr[1][1]  && list.contains(3))
            f=3;
            else if(arr[2][0]==arr[0][2]  && list.contains(5))
            f=5;
            else if(arr[1][1]==arr[0][2]  && list.contains(7))
            f=7;
            else
            f= list.get(rand.nextInt(list.size()));
            System.out.println("computer:"+f);
            int d = list.indexOf(f); 
            list.remove(d);
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
                System.out.println("computer win");
                m=9;
                break;
            }
            else if(m==9){
                System.out.println("match draw");
                break;
                }
            System.out.print("player * :");
             f=s.nextInt();
             if(list.contains(f)){
            d = list.indexOf(f); 
            list.remove(d);
             }
             else{
             System.out.println("wrong input");
             m=9;
             break;
             }
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
                System.out.println("Player win");
             m=9;
             break;
            }
        }
    }
}   