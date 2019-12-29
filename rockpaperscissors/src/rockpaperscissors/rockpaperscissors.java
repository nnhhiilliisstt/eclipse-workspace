package rockpaperscissors;
import java.util.Scanner;
public class rockpaperscissors {
	final static int rock=1,scissors=2,paper=3;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("player 1: choose rock-1,scissors-2,paper-3");
	int player1 = sc.nextInt();
	System.out.println("player 2: choose rock-1,scissors-2,paper-3");
	int player2 = sc.nextInt();
	
	if (player1 == player2) {
		System.out.println("it is a tie");
	}else
		switch(player1) {
		case rock:
			if (player2 == scissors)
				System.out.println("player1 wins,rock breaks scissors");
			else
				System.out.println("player2 wins,paper covers scissors");
			break;
			
		case paper:
			if (player2 == scissors)
				System.out.println("player2 wins,scissors cut paper");
			else
				System.out.println("player1 wins,paper covers rock");
			break;
			
		case scissors:
			if (player2 == paper)
				System.out.println("player1 wins, scissors cut paper");
			else
				System.out.println("player2 wins,rock breaks scissors");
			break;
		
		
		
		
	}

}
}