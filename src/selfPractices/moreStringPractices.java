package selfPractices;

import java.util.Scanner;

public class moreStringPractices {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
       System.out.println("Enter a name");
       String str = scan.nextLine();
     /*//System.out.println(name.endsWith("x"));
       
       ////ORRRRRRRRRRRRR///
       boolean bool1 = name.startsWith("A");
       boolean bool2 = name.startsWith("x");
   if(bool1 && bool2) {
	   System.out.println("the name matches");
   }else {
	   System.out.println("Not matches");
   }
   System.out.println(name.lastIndexOf("a"));   */
  
  
	 
      
		
	
	
	//  System.out.println(str.startsWith("Do"));
	//	System.out.println(str.contains("let"));
	//	System.out.println(str.lastIndexOf("t"));
	//	System.out.println(str.endsWith("a"));
		/////OR///
	//	boolean yesOrNo = str.endsWith("a");
	//	System.out.println(yesOrNo);
		
		int count = str.length();
		int midIndex = count/2;
		char midL = str.charAt(midIndex-1);
				
		System.out.println(midL);
		
	}

}
