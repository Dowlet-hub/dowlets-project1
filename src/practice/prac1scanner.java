package practice;

import java.util.Scanner;

public class prac1scanner {

	public static void main(String[] args) {
		
		Scanner dowlet = new Scanner(System.in);
		
		System.out.println("please enter your name");
		
		String firstName= dowlet.next();
		
		System.out.println("your first name is: "+	firstName);
		
		System.out.println("please enter your age");
		
		int age = dowlet.nextInt();
		
		System.out.println("your age is: "+age);
		
	
		

	}

}
