package operator;
import java.util.Scanner;
public class operator{
  public static void main(String[] args){
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers to perform different Arithmetic, Logical and Bitwise operations");
      System.out.println("Enter number 1: ");
      a=sc.nextInt();
      System.out.println("Enter number 2: ");
      b=sc.nextInt();
      System.out.println("Addition: "+(a+b));
      System.out.println("Subtraction: "+(a-b));
      System.out.println("Multiplication: "+(a*b));
      System.out.println("Bitwise left: "+(a<<b));
      System.out.println("Bitwise Right: "+(a>>b));
      System.out.println("Checking if a is greater than b: "+(a>b));
      System.out.println("Checking if b is greater than a: "+(a<b));
      System.out.println("Checking equality: "+(a==b));
  }
}
