package selfPractices;

import java.util.Scanner;

public class dowlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = " Dowlet ";
		//name.trim();
		//System.out.println(name);
		
		
		//String name = "Dowlet";
		//System.out.println(name);
    	//
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter 2 different names");
    	String name1 = scan.next();
    	String name2 = scan.next();
    	
    	/*if(ame1.equalsIgnoreCase(name2)) {
    		System.out.println(true);
    		
    	}else {
    		System.out.println(false);
    	}
    	if(name1.length()>name2.length()) {
    		System.out.println(name1.charAt(1));
    	}else {
    		System.out.println(name1.charAt(2));
    	}*/
    		
    	System.out.println(name1.equalsIgnoreCase(name2)? true: false);
    	
    	System.out.println(name1.length()>name2.length()? name1.charAt(1) : name1.charAt(2));
	}

}
