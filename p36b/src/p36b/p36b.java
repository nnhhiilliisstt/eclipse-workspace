package p36b;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Student{
    String name = "";
    String rollNo = "";
    int age = 0;
    void setRollNo(String r){
        this.rollNo = r;
    }
    void setName(String n){
        this.name = n;
    }
    void setAge(int a){
        this.age = a;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    String getroll(){
        return this.rollNo;
    }
    void displayDetails(){
        System.out.println("Name = "+this.name+"\n"+"Roll No = "+this.rollNo+"\n"+this.age);
    }
}
class Batch{
    Scanner sc = new Scanner(System.in);
    String batchName = "";
    int numStudents = 0;
    Student[] stuarr;
    void setBatchName(String n){
        this.batchName = n;
    }
    void setNumStudents(int a){
        this.numStudents = a;
        stuarr = new Student[numStudents];
    }
    String getBatchName(){
        return this.batchName;
    }
    int getNumStudents(){
        return this.numStudents;
    }
    void fillBatch(){
        for(int i=0;i<numStudents;i++){
            System.out.println("Enter name,age,rollno of Student:");
            String name = sc.next();
            int age = sc.nextInt();
            String c = sc.next();
            Student s = new Student();
            s.setRollNo(c);
            s.setName(name);
            s.setAge(age);
            stuarr[i] = s;
        }
    }
    void displayBatch(){
        System.out.println("Batch name = "+this.batchName);
        System.out.println("No of Student = "+this.numStudents);
        for(int i=0;i<numStudents;i++){
            Student s = stuarr[i];
            s.displayDetails();
        }
    }
}
class p36b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter batch name:");
        String s = sc.next();
        System.out.println("Enter no. of students:");
        int n = sc.nextInt();
        Batch b = new Batch();
        b.setBatchName(s);
        b.setNumStudents(n);
        b.fillBatch();
        b.displayBatch();
    }
}