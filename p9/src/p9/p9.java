package p9;
import java.util.Scanner;
class Student{
    String s="";
    public void setname(String n){
        this.s=n;
    }
    public String getname(){
        return this.s;
    }
}
class p9{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
            String n = sc.nextLine();
            Student st = new Student();
            st.setname(n);
            System.out.println(st.getname());
    }
}