package Mentoring;

import java.util.Scanner;

public class SwitchStatementTask1 {

	public static void main(String[] args) {

   
		
	  
	 
	   Scanner scan = new Scanner(System.in);
       System.out.println("Enter command:");
     String response = scan.next();
       
       switch(response.charAt(0)){
       case 'y':   	  
    	   System.out.println("Your request is being processed");  
   	       break;	
    	    
       case 'n':  
    	   System.out.println("Thank you anyway for your consideration");
    	   break;
       case 'h':
    	   System.out.println("Sorry, no help is currently available");
    	   break;
    	   default:
    		   System.out.println("Invalid entry, please try again!");
    		   break;
    		   
    		   
    	
        
    	 
    	   
       }

      

	}

}
