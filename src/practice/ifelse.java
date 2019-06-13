package practice;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		
		/*boolean  niceWheather = true;
		
		if(niceWheather) {
			
			System.out.println("go to the pool");
			
			
		}else {
			System.out.println("stay at home \nwatch movie guys");
		}*/
		
		Scanner input = new Scanner(System.in);
		/*System.out.println("please enter username and password");
		
		String userName =  input.next();
		String password = input.next();
		
		String validUserName = "daveata";
		String validPwd = "abc123";
	
		if(userName.equals(validUserName)&& password.equals(validPwd)) {
			 System.out.println("pasword entered succesfully"+"great job");
			 System.out.println("password is valid.");
			
		}else {
			
			System.out.println("invalid entry, try again please");
		}*/
		
		
		System.out.println("please enter your current speed");
		
		int currentSpeed = input.nextInt();
		
		if(currentSpeed>60) {
			System.out.println("slow down please");
			currentSpeed -= 5;
			
			
			
			}else {
				
				System.out.println("keep driving your speed is OK");
			}
		
		
		
	}

}
