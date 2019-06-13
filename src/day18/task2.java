package day18;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int x = 0;
   
     
      
       while(!((x==5)||(x==10))){
    	   System.out.println("Enter 5 or 10$ bills only");
    	    x = scan.nextInt();
       }
    	  
    	   System.out.println("Good job!");
    	   
	}

}
