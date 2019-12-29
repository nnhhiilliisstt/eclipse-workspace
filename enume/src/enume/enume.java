package enume;

import java.util.Scanner; 
public class enume {


enum Day 
{ 
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	THURSDAY, FRIDAY, SATURDAY; 
} 

	Day day; 
	public enume(Day day) 
	{ 
		this.day = day; 
	} 
	public void dayIsLike() 
	{ 
		switch (day) 
		{ 
		case MONDAY: 
			System.out.println("Mondays are bad."); 
			break; 
		case FRIDAY: 
			System.out.println("Fridays are better."); 
			break; 
		case SATURDAY: 
		case SUNDAY: 
			System.out.println("Weekends are best."); 
			break; 
		default: 
			System.out.println("Midweek days are so-so."); 
			break; 
		} 
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day:");
		String str = sc.next(); 
		enume t1 = new enume(Day.valueOf(str)); 
		t1.dayIsLike(); 
	} 
} 
