package day23;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		
		/*int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;*/
										
		
		//int[] numbers = new int[5];
		//System.out.println(numbers);
		/*double [] numbers = new double[4];
		
		double n1 =10.0;
		double n2 =15.5;
		double n3 =20.8;
		double n4 =25.8;
		
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		
		System.out.println(numbers[0]);*/
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    
				char lastCharacter = word.charAt(word.length()-1);
				   System.out.println(lastCharacter);
		
	}

}
