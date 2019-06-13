package day6;

import java.util.Scanner;

public class ScannerPracticeContinuied {

	public static void main(String[] args) {
		 
		Scanner input= new Scanner(System.in);
		System.out.println("enter your name today :");
		String name=input.next();
		
		System.out.println("enter your age today :");
		String age=input.next();
		
		Scanner dowlet = new Scanner(System.in);
		 
		System.out.println("What year born? ");
		 int year =dowlet.nextInt();
		System.out.println("you are " + (2019-year) + " years old.");
	
		
		
		System.out.println("your name is : +name"
		                  +"\n Your Age is"+ age);
		                  
		

	}

}
