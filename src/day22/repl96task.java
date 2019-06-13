package day22;

import java.util.Scanner;

public class repl96task {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter inhabitants count");
		int inhabitants = scan.nextInt();
		
		//each day half the population is gone by Zombie attack
		int day = 0;
		while(inhabitants>0) {
			System.out.println("Day" + day+ " ["+inhabitants +"]");
			inhabitants = inhabitants/2;
			day++;
			}
		
	}

}
