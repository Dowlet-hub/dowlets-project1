package Mentoring;

import java.util.Scanner;

public class SwitchStatementWeekDays {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number:" );
		
		int weekDay = scan.nextInt();
		String dayName = " ";
		switch (weekDay) {
		case 1:
			//System.out.println("Monday");
			dayName = "Monday";
			break;
		case 2:
			//System.out.println("Tuesday");
			dayName = "Tuesday";
			break;
			
		case 3:
			//System.out.println("Wednesday");
			dayName = "Wednesday";
			break;
		case 4:
			//System.out.println("Thursday");
			dayName = "Thursday";
			break;
		case 5: 
			//System.out.println("Friday");
			dayName = "Friday";
			break;
		case 6: 
			//System.out.println("Saturday");
			dayName = "Saturday";
			break;
		case 7:
			//System.out.println("Sunday");
			dayName = "Sunday";
			break;
			default:
				System.out.println("Invalid number");
				break;
		}
		System.out.println(dayName);

	}

}
