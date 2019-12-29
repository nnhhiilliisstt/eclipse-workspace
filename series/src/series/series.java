package series;

import java.util.Scanner;
class series{
    public static void main(String[] args) {
        int i,x=0,y=1,z;
        Scanner a;
        a = new Scanner(System.in);
        System.out.print("Enter the size:");
       int n = a.nextInt();
        System.out.print("Even Series:");
        for(i=0;i<=n;i++)
        if(i%2==0)
        System.out.print(i+" ");

        System.out.print("\nOdd Series:");
        for(i=0;i<=n;i++)
        if(i%2!=0)
        System.out.print(i+" ");

        
        System.out.print("\nFibbonnic Series:");
        System.out.print(x+" "+y);
        for(i=2;i<n;i++)
        {
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        }   

        System.out.print("\nPrime Series:");
        i=2;x=0;
        while(x<n)
        {
            int l=0;
            for(int j=2;j<i;j++)
            if(i%j==0)
            l+=1;
            if(l==0){
            System.out.print(i+" ");
                x+=1;
        }
            i+=1;
        }

       class Addition
       {
        long factorial = 1;
        public long additionFunction(int num){
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        return factorial;
    }
    }

        System.out.print("\nSine Series:");
        String t;
        for(i=0;i<=n;i++)
        {
            double j = Math.pow(-1,i);
            int va = (int)j;
            String k = Integer.toString(va);
            String l = Integer.toString(2*i);
            Addition additionObj = new Addition();
            long Value = additionObj.additionFunction(2*i);
            String v = Long.toString(Value);
            String p = (k+"*"+"t^"+l)+"/"+v;
            System.out.print(p+" ");
        }

        System.out.print("\nCosine Series:");
        for(i=0;i<=n;i++)
        {
            double j = Math.pow(-1,i);
            int va = (int)j;
            String k = Integer.toString(va);
            String l = Integer.toString(2*i+1);
            Addition additionObj = new Addition();
            long Value = additionObj.additionFunction(2*i+1);
            String v = Long.toString(Value);
            String p = (k+"*"+"t^"+l)+"/"+v;
            System.out.print(p+" ");
        }

        System.out.print("\n");
    }
}