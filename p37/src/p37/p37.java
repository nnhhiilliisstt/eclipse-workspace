package p37;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Player{
    String name = "";
    int age = 0;
    public Player(String n,int a){
        this.name = n;
        this.age = a;
    }
    void display(){
        System.out.println("Name = "+this.name+"\n"+"Age = "+this.age);
    }
}
class Team{
    String name = "";
    int num_stu = 60;
    Player[] plarr;
    public Team(String name,int num_stu){
        this.name = name;
        this.num_stu = num_stu; 
        plarr = new Player[num_stu];
    }
    Scanner sc = new Scanner(System.in);
    void fillTeam(){
        for(int i=0;i<num_stu;i++){
            System.out.println("Enter name,age of Player:");
            String name = sc.next();
            int age = sc.nextInt();
            Player s = new Player(name,age);
            plarr[i] = s;
        }
    }
    void display(){
        for(Player s:plarr)
        s.display();
    }
}
class Tournament{
    String name = "";
    int num_team = 60;
    Team[] tearr; 
    public Tournament(String name,int n){
        this.name = name;
        this.num_team = n;
        tearr = new Team[n];
    }
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void fillTournament(){
        for(int i=0;i<num_team;i++){
            System.out.println("Enter name of Team and no. of Player:");
            String name = sc.next();
            list.add(name);
            int ns = sc.nextInt();
            Team b = new Team(name,ns);
            b.fillTeam();
            tearr[i] = b;
        }
    }
    void display(){
        for(int i=0;i<num_team;i++){
            System.out.println(list.get(i)+" Player");
            Team b = tearr[i];
            b.display();
        }
       
    }
}
class TestTournament{
    int n = 0;
    Tournament[] tarr;
    public TestTournament(int a){
        this.n = a;
        tarr = new Tournament[a];
    }
    void fillTestTournament(){
    for(int i=0;i<n;i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tournament name and no. of Team:");
        String dname = sc.next();
        int nb = sc.nextInt();
        Tournament d = new Tournament(dname,nb);
        d.fillTournament();
        tarr[i] = d;
    }
    }
    void display(){
        System.out.println("Details are:");
        for(int i=0;i<n;i++){
            Tournament b = tarr[i];
            b.display();
        }
       System.out.println();
    }
}
class p37{
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Tournament:");
        int nb = sc.nextInt();
        TestTournament d = new TestTournament(nb);
        d.fillTestTournament();
        d.display();
    }
}