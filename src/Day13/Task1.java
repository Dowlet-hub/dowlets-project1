package Day13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

// 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 names");
		String name1 = scan.next();
		String name2 = scan.next();
		
		boolean b1 = name1.equalsIgnoreCase(name2);
		System.out.println(" is Name same--> " + b1);
		
		int count1 = name1.length();
		int count2 = name2.length();
		
		int lastChar = count1-1;
		
		//System.out.println(name2.charAt(name2.length()-1));
          System.out.println("last Character of word is: " +name2.charAt(lastChar));

		System.out.println("first Character of name:" + name1.charAt(0));
		
//		if(count1 > count2) {
//			System.out.println(name1.charAt(1));
//			
//		}else {
//			System.out.println(name2.charAt(2));
//		}
		
		System.out.println("Charecter is : " + ((count1 > count2 )? name1.charAt(1): name2.charAt(2) ));
				
	}

}
