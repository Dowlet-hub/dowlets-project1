package day30;

import java.util.Scanner;

//import day29.Spartan;

public class utility {

	public static void main(String[] args) {

        printUserName(); 
        printUserName(); 
        //Spartan.releaseTheHorse();   if it is in same package you can call without import.
        
	}

	public static void printUserName() {

	    Scanner scan = new Scanner(System.in) ; 
	    System.out.println("Enter your name please");
	    
	    String name = scan.next(); 
	    System.out.println("You entered : " + name);    
	    
		
		
	}
	
}
