package selfPractices;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		//print out welcome to math library
		//ask user for 2 integer;
		//write a simple IF statement
		//if the summary of 2 numbers are greater than 100 then print out you entered great numbers
		//else looks like your sum is less than 100
		
		System.out.println("Welcome to math Library");
		
		System.out.println("please enter 2 numbers");
		
		
		Scanner input= new Scanner(System.in);
		
		int number1 = input.nextInt();
		 int number2 = input.nextInt();
		  
		 if(number1 +number2 >100){
			 
		  			 
			 System.out.println("you entered great numbers");
	
		 }else 
			 System.out.println("looks like your sum is less than 100");
			 
			 
		 
		 
		
		
		
		
		

	}
}