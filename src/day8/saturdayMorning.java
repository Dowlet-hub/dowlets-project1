package day8;

import java.util.Scanner;

public class saturdayMorning {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ; 
	    
	    System.out.println("Enter your name please : " );
	    String name  = scan.next();
	    //String name  = scan.nextLine();
	    scan.nextLine(); // this is just to capture enter key press 
	    
	    
	    System.out.println("Enter your company please : " );
	    //String company = scan.next() ; 
	    String company = scan.nextLine() ; 
	    
	    System.out.println("Enter your age please : " );
	    int age = scan.nextInt(); 
	    
	    System.out.println("Enter your byte please : " );
	    byte b = scan.nextByte();
	    
	    System.out.println("Enter your short please : " );
	    short s = scan.nextShort();
	    System.out.println("Enter your long please : " );
	    long l = scan.nextLong();
	    System.out.println("Enter your float please : " );
	    float f = scan.nextFloat();
	    System.out.println("Enter your double please : " );
	    double d = scan.nextDouble();
	    //char c = scan.nextChar(); NO CHAR !!!~ 
	    System.out.println("Enter your boolean please : " );
	    boolean isHungry = scan.nextBoolean();
	    
	    
	    
	    
	    
	    
	    System.out.println("Hello Fellow coder , your name is "+ name
	              + " you work at " + company
	              + " Your age is  " + age+"your byte is : "+b+"your short is:"+s+"your long is:"+l+"your float is:"+f+"your double is:"+d+"your boolean is;"+isHungry);
	    
		
		
		
		
		

	}

}
