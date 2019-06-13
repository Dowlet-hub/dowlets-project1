package practice;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		   Scanner input = new Scanner(System.in);
		    
		    System.out.println("Split:");
		    int num = 1;
		    String split = input.next();
		    
		    if (split.equalsIgnoreCase("yes"))
		    {
		      System.out.println("Number of people:");
		      num = input.nextInt();
		    }
		    
		    System.out.println("Check amount:");
		    
		    double total = input.nextDouble();
		    
		    System.out.println("Service Quality:");
		    
		    int tip = 0;
		    
		    String quality = input.next();
		    
		    switch(quality.toLowerCase())
		    {
		      case "poor":
		        tip = 5;
		        break;
		      
		      case "fair":
		        tip = 10;
		        break;
		        
		      case "good":
		        tip = 15;
		        break;
		      
		      
		      case "great":
		        tip = 20;
		        break;
		        
		      case "excellent":
		        tip = 25;
		        break;  
		      
		      
		      
		      
		    }
		    

		    
		    double tipAmount = total*tip/100;
		    
		    double totalAmount = total+tipAmount;
		    double totalPerPerson = totalAmount/num;
		    double tipPerPerson = tipAmount/num;
		    
		    
		    String abc = "&";
		        for(int i = 1; i <num;i++)
		    {
		    	abc = abc +"&";
		    }
		    
		    
		    System.out.println("Number of people entered: "+ abc);
		    System.out.println("Total to pay: " + totalAmount);
		    System.out.println("Total tip: " + tipAmount);
		    System.out.println("Total per person: " + totalPerPerson);
		    System.out.println("Tip per person: " + tipPerPerson);
		    
		    
		   
		   
		   
	
	}
		   
}		   
		   
