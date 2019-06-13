package day23;

public class ExtractLCaseFormString {

	public static void main(String[] args) {
//write a program to extract lowercase letter from a given String — a1b2c3 --> abc
		
		String str = "5 Little Monkey Jumping on The Bed" ;
		
		 
	    
	    
//	    char eachChar = 'h' ; 
//	    System.out.println( eachChar >= 'a' );
//	    System.out.println( eachChar <= 'z' );
	//    
//	    if( eachChar >= 'a' && eachChar <= 'z')  {
//	      System.out.println("IT'S lowercase");
//	    }
//	    System.out.println("THE END");
	    
	    String allLowercaseStr = ""; 
	    for (int i = 0; i < str.length(); i++) {
	      /// storing each character inside variable each
	      // each iteration it will store that char 
	      char each = str.charAt(i); 
	      // checking whether this character at this iteration 
	      // is within the range of a-z
	      if( each >= 'a' && each <= 'z')  {
	        allLowercaseStr += each ;  // add on top of each other
	        //System.out.println("IT'S lowercase : " + each );
	      }
	    }
	    System.out.println( allLowercaseStr);
	    
	    

	}

}
