package selfPractices;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
		 String word = scan.nextLine();
		    word = word.toLowerCase().replace(" ", "");
		

		    
		    		    int count = word.length();
		    		    
		    		    String reversed = "";
		    		    
		    		    while(count>0) {
		    		    	
		    		    	count--;
		    		    	reversed += word.charAt(count) + " ";
		    		    		
		    		    }
		    
		    
		    System.out.println(reversed);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    //		int count = word.length();
//		
//		String reversed = "";
//		while(count>0) {
//			
//			count--;			
//			reversed += word.charAt(count);
//			
//			
//			
//		}
//		
//		
//		
//		
//		System.out.println(word.equals(reversed));
//		
//		
//		
//		
//		
		
		
		
			//for loop ile reverse
//			String str = "Goksel";
//			String reversed = " ";
//			
//			
//			for(int i = str.length()-1; i>=0;  i-- ) {
//				   
//				reversed += str.substring(i, i+1);
//				//System.out.print(str.substring(i, i+1));
//			
//			}
//			System.out.print(reversed);
	}
               

}
