package Day17;

import java.util.Scanner;

public abstract class WhileLoopMultipleCondition {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		 int number = scan.nextInt();
		 int x =1;
		 while(x<=number) {
			 System.out.print(x++ +" ");

		 }
		System.out.println("END");//if condition is not true you will go outside of block...
	}

}
