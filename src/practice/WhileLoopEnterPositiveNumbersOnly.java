package practice;

import java.util.Scanner;

public class WhileLoopEnterPositiveNumbersOnly {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);		
		
		int total = 0;
		
		System.out.println("Enter Positive Integer");
		int PosInt = scan.nextInt();
		
	
		
		while(PosInt >0) {
			
			
			total = total+PosInt;
			PosInt = scan.nextInt();
		}
			System.out.println("Sum of All numbers " + total);
		}
		

	}


