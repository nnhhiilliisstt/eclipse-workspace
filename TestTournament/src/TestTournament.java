package TestTournament;
import java.util.Scanner;
class Player{
    String name;
    int age;
    public Player(){
        name="";
        age=0;
    }
    
    void setName(String n){
        this.name=n;
    }
    void setAge(int a){
        this.age=a;
    }
    String getName(String n){
        return this.name;
    }
    int getAge(int a){
        return this.age;
    }
    void displayData(){
        System.out.println("Name of the Player: "+this.name);
        System.out.println("Age of the Player: "+this.age);
    }
}

class Team{
    String name_of_team;
    int num_of_player;
    Player plArr[];
    public Team(){
        name_of_team="";
        num_of_player=0;
        plArr=new Player[0];
    }
    
    void setTeamName(String n){
        this.name_of_team=n;
    }
    void setNumber(int num){
        this.num_of_player=num;
    }
    String getTeamName(){
        return this.name_of_team;
    }
    int getNumber(){
        return this.num_of_player;
    }
    void fillData(){
        plArr=new Player[this.num_of_player];
        int i;
        for(i=0;i<this.num_of_player;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of the Player "+(i+1)+": ");
            String n=sc.nextLine();
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter the Age of the Player "+(i+1)+": ");
            int a=sc2.nextInt();
            Player ob=new Player();
            ob.setName(n);
            ob.setAge(a);
            plArr[i]=ob;
        }
    }
    void displayDetails(){
        System.out.println("Name of the Team: "+this.name_of_team);
        int i=0;
        for(Player pl: plArr){
            System.out.println("***************************************");
            System.out.println("Details of Player: "+(i+1));
            pl.displayData();
            i+=1;
        }
    }
}
class Tournament{
    String name_of_tournament;
    int num_of_team;
    Team teamArr[];
    public Tournament(){
        name_of_tournament="";
        num_of_team=0;
        teamArr=new Team[0];
    }
    
    void setTournamentName(String n){
        this.name_of_tournament=n;
    }
    void setNumber(int num){
        this.num_of_team=num;
    }
    String getTournamentName(){
        return this.name_of_tournament;
    }
    int getNumber(){
        return this.num_of_team;
    }
    void fillData(){
        teamArr=new Team[this.num_of_team];
        int i;
        for(i=0;i<this.num_of_team;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of the Team "+(i+1)+": ");
            String n=sc.nextLine();
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter the No of the Player in the Team"+(i+1)+": ");
            int r=sc1.nextInt();
            Team ob=new Team();
            ob.setTeamName(n);
            ob.setNumber(r);
            ob.fillData();
            teamArr[i]=ob;
        }
    }
    void displayDetails(){
        System.out.println("Name of the Batch: "+this.name_of_tournament);
        int i=0;
        for(Team bat: teamArr){
            System.out.println("#####################################################");
            System.out.println("Details of team: "+(i+1));
            bat.displayDetails();
            i+=1;
        }
    }
    
}

public class TestTournament {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name of the Tournament: ");
        String n=in.nextLine();
        System.out.println("Enter number of team in the tournament: ");
        int num=in.nextInt();
        Tournament ob=new Tournament();
        ob.setTournamentName(n);
        ob.setNumber(num);
        ob.fillData();
        ob.displayDetails();
    }
}

