package Mentoring;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

       int score; 
       
       Scanner scan = new Scanner(System.in);
       System.out.println("what is your score:");
       score = scan.nextInt();
       
              if(score==100) {
            	  System.out.println("You did a great JOB!");
              }else  if(score>=90) {
            	  System.out.println("Your score is A ");
              }else if (score>=80) {
            	  System.out.println("Your score is B ");
              }else if (score>=70) {
            	  System.out.println("your score is C");
              }else {
            	  System.out.println("Try again");
              }
              
              //TASK1
         // Create int variable to store age. if age is bigger than 18 print " Acces Granted"
         // if not print (" You are too little")
       
       int age ;
       System.out.println(" Enter your age: ");
       age= scan.nextInt();
       if(age>=18) {
    	   System.out.println(" Access Granted");
       }else {
    	   System.out.println("You are too little");
       }
    	   
	}

}
