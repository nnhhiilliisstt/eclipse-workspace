package p36a;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Student{
    String name = "";
    int age = 0;
    double cgpa = 0.0;
    public Student(String n,int a,double c){
        this.name = n;
        this.age = a;
        this.cgpa = c;
    }
    void display(){
        System.out.println("Name = "+this.name+"\n"+"Age = "+this.age+"\n"+"cgpa = "+this.cgpa);
    }
}
class Batch{
    String name = "";
    int num_stu = 60;
    Student[] starr;
    public Batch(String name,int num_stu){
        this.name = name;
        this.num_stu = num_stu; 
        starr = new Student[num_stu];
    }
    Scanner sc = new Scanner(System.in);
    void fillBatch(){
        for(int i=0;i<num_stu;i++){
            System.out.println("Enter name,age,cgpa of Student:");
            String name = sc.next();
            int age = sc.nextInt();
            double c = sc.nextDouble();
            Student s = new Student(name,age,c);
            starr[i] = s;
        }
    }
    void display(){
        for(Student s:starr)
        s.display();
    }
}
class Department{
    String name = "";
    int num_bat = 60;
    Batch[] barr; 
    public Department(String name,int n){
        this.name = name;
        this.num_bat = n;
        barr = new Batch[n];
    }
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void fillDepartment(){
        for(int i=0;i<num_bat;i++){
            System.out.println("Enter name of batch and no. of student:");
            String name = sc.next();
            list.add(name);
            int ns = sc.nextInt();
            Batch b = new Batch(name,ns);
            b.fillBatch();
            barr[i] = b;
        }
    }
    void display(){
        for(int i=0;i<num_bat;i++){
            System.out.println(list.get(i)+" year Student");
            Batch b = barr[i];
            b.display();
        }
       
    }
}
class p36a{
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department name and no. of batch:");
        String dname = sc.next();
        int nb = sc.nextInt();
        Department d = new Department(dname,nb);
        d.fillDepartment();
        System.out.println("Details are:");
        d.display();
    }
}