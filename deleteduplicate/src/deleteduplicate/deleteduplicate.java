package deleteduplicate;
import java.util.Scanner;
public class deleteduplicate {
	public static void main(String[] args)
	{
        System.out.print("Enter string:");
        Scanner sc = new Scanner(System.in);
		String input=sc.nextLine(); 			
		String[] ar=input.split(" ");	
		for(int i=0;i<ar.length;i++)		
		{
			if(ar[i]!=null)
			{
			
			for(int j=i+1;j<ar.length;j++)	
			{
				
			if(ar[i].equals(ar[j]))	
				{
					ar[j]=null;
				}
			}
			}
		}
		for(int k=0;k<ar.length;k++)		
		{
			if(ar[k]!=null)
			{
				System.out.print(ar[k]+" "     );
			}
         }
         System.out.println();  
	}
}
