package day5;

import java.util.Scanner;

public class day5homework {

	public static void main(String[] args) {
		
		
		   
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter your first name : ");
        String firstName=input.nextLine();
        System.out.println("Your first name is "+ firstName);
        
        System.out.println (" Enter your last name : ") ;
        String lastName=input.nextLine();
        System.out.println("Your last name is");
        
        System.out.println( "Enter your nationality : ");     
        String nationality=input.nextLine();
        System.out.println("Your nationality is"+nationality);
        
        System.out.println( "Enter your age : ");
        String age=input.nextLine();
        System.out.println("Your age is:");     
        
        
        System.out.println( "Enter your city : ");
        String city=input.nextLine();
        System.out.println("Your city is"+city);
        
        System.out.println( "Enter your state: ");
        String state=input.nextLine();
        System.out.println("Your state is "+state);
        
        System.out.println( "What do you want to do after this Course?: ");
        String Aim=input.nextLine();
        System.out.println("What do you want to do after this Course?"+Aim);
        
        System.out.println("Your full name is: " +firstName+ " "+lastName+" ,your nationality is: " +nationality+ " ,your city is " +city+ " ,your state is " +state+ " ,What do you want to do after this Course? " +Aim+ " ,your age is:"+age);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
