package practice;

import java.util.Scanner;

public class doWhiletasks {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number");
         
		
		int x = 0; int y = 0;         
		
		
		do {
			System.out.println("Enter num1");
			 y = scan.nextInt();
			System.out.println("Enter num2");
			 x= scan.nextInt();
			
			
		} while(x+y<=100);
			System.out.println("END");
		}
			
		
	}


