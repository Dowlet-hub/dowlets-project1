package practice;

import java.util.Scanner;

public class task52 {

	public static void main(String[] args) {
	
		//Write your code inside the method.
		//Use the values given as method parameters.
		//Assign final values.
		//Then user should select service quality that will correspond to tip percent.
		//Poor = 5%
		//Fair = 10%
		//Good = 15%
		//Great = 20%
		//Excellent = 25% 
		//The program should display the following information based on the user input: 
		//Split or No split
		//Number of people entered: &&&&
		//Service Quality: 
		//Total to pay:
		//Total tip:
		//Total per person:
		//Tip per person:
		//https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

		//Input: 
		//Split:Yes
		//Number of people:4
		//Check amount:476.0
		//Service Quality:Excellent

		//Output:
		 
		//Number of people entered: &&&&
		//Total to pay: 595.0
		//Total tip: 119.0
		//Total per person: 148.75
		//Tip per person: 29.75

		
		 
		  
		Scanner scan = new Scanner(System.in);
		 
		double totalToPay;
		   double totalPerPerson;
		   double tipPerPerson=0;
		   double totalTip = 0;
		   System.out.println("Split or No split");
		   boolean split = scan.nextBoolean();
		   
		   System.out.println("Number of people entered:");
		   int numberOfPeople = scan.nextInt();
		   
		   System.out.println("Check amount:");
		   double checkAmount = scan.nextDouble();
		   
		   System.out.println("Service Quality:");
		   String serviceQuality = scan.next();
		   
		   switch (serviceQuality){
		        case "Poor":
		        totalTip = (checkAmount*0.05);
		        break;
		         case "Fair":
		        totalTip = (checkAmount*0.1);
		        break;
		         case "Good":
		        totalTip = (checkAmount*0.15);
		        break;
		         case "Great":
		        totalTip = (checkAmount*0.2);
		        break;
		         case "Excellent":
		        totalTip = (checkAmount*0.25);
		        break;
		   }
		   totalToPay = checkAmount + totalTip;
		   totalPerPerson = totalToPay/4;
		   tipPerPerson = totalTip/4;
		   
		   System.out.println(totalToPay);
		   System.out.println(totalTip);
		   System.out.println(totalPerPerson);
		   System.out.println(tipPerPerson);
		  
		   
		   
		   
		   
		   
		

	


		  
	}

}
