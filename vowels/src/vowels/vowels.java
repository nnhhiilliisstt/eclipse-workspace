package vowels;
import java.util.Scanner;
import java.util.ArrayList;

public class vowels {

  public static void main(String args[]){
      
      Scanner sc=new Scanner(System.in);
      int count_each_vowel[]={0,0,0,0,0};
      System.out.println("Enter the string");
      String str=sc.nextLine();
      int count=0,i;
      int length=str.length();
      for (i=0;i<length;i++){
          char ch=str.charAt(i);
          if (ch=='a' || ch=='A'){
            count+=1;
              count_each_vowel[0]+=1;
          }
        if (ch=='e' || ch=='E'){
                 count+=1;
              count_each_vowel[1]+=1;
          }
          if (ch=='i' || ch=='I'){
              count+=1;
              count_each_vowel[2]+=1;
          }
            if (ch=='o' || ch=='O'){
              count+=1;
              count_each_vowel[3]+=1;
          }
               if (ch=='u' || ch=='U'){
                 count+=1;
              count_each_vowel[4]+=1;
          }
      }
      System.out.println("Total no of vowels: "+count);
     System.out.println("Each Vowel Count");
     System.out.println("A:"+count_each_vowel[0]);
     System.out.println("E:"+count_each_vowel[1]);
     System.out.println("I:"+count_each_vowel[2]);
     System.out.println("O:"+count_each_vowel[3]);
     System.out.println("U:"+count_each_vowel[4]);
     
     
  }
}