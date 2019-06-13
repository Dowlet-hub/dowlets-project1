package practice;

import java.util.Scanner;

public class swithStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter reate for this restaurant 1 to 3");
		
		//int restaurantRatings = scan.nextInt();
		int restaurantRatings = scan.nextInt();
		switch(restaurantRatings) {
		//default:
		case 1:
		//case 5:
		//case 6:	
			
			System.out.println("This restaurant is not favorite!");
			break;
		case 2: 
			System.out.println("This restaurant is good!");
	        break;
		case 3:
			System.out.println("This restaurant is my favorite!");
			break;
			default:
				System.out.println("I never dined in this restaurant");
			break;	
			
			
		
		}
		
		

	}

}
