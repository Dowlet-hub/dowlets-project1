package day23;

public class printA_Z {

	public static void main(String[] args) {
		
		char a = 'a';
		
		System.out.println(a+1);////lowercase a is = 97 in AsCII table
		char next = (char) ( a+1);
		
		System.out.println(next);//a den sonra b geler
                 
		 int asciiCode = 'a' ; 
//	    System.out.println(asciiCode);
	    
	    
	    for(int i = 'a' ; i<= 'z' ; i++ ) {
	      
	      char eachChar = (char) i ; 
	      System.out.print( eachChar);
	      
	    }
                		 
	}

}
