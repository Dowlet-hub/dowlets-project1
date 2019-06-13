package day8;

public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(true && true);
	    System.out.println(false && true);
	    System.out.println(true && false);
	    System.out.println(false && false);
	    
	    System.out.println(2 < 4 && 4< 6);
	  
	    boolean b = 10 == 10 && false;
	    System.out.println(b);
	    
	   String drink = "tea";//"coffee";
	   boolean hot = true;
	   boolean free= true;
	   
	  boolean bool =  drink.equals("coffee") && hot && free;
	  System.out.println(bool);
	  
	  
	    System.out.println(true || true);
	    System.out.println(false || true);
	    System.out.println(true || false);
	    System.out.println(false || false);
	  
	   bool = 4 > 10 || 4 < 5;
	   System.out.println(bool);
	 
	   bool =drink.equals("tea")||drink.equals("coffee"); 
	   
	   System.out.println(!false);
	   
	   bool = true;
	   
	   System.out.println(!bool);	   
	   
		   
	
	}

} 