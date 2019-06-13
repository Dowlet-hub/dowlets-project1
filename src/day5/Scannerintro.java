package day5;


//import scanner class to define the location

import java.util.Scanner;

public class Scannerintro {

	public static void main(String[] args) {

		//Create a scanner object
	Scanner userInput= new Scanner(System.in);
	
	//ask a user questions
	System.out.println("Enter your name please : ");
	
	//store user input
	String name =userInput.next();
	
	
	System.out.println( "You have entered : "+ name);
	
	

	}

}
