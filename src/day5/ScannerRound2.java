package day5;

import java.util.Scanner;

public class ScannerRound2 {

	public static void main(String[] args) {
	
		//create scanner object		
		Scanner input = new Scanner(System.in);
		
		//asking user questions
		
		System.out.println("enter your first name");
		
		// force user to enter input/data(first name here)
		
		String firstName=input.next();
		System.out.println("Your first name is "+ firstName);
		
		System.out.println("enter your last name");
		String lastName= input.next();
		System.out.println("your last name is "+lastName);
		
	System.out.println("Your full name is "+firstName+ " "+lastName);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
