package Day38;

import java.util.ArrayList;

public class ArrayListTasks {

	public static void main(String[] args) {

		   /*
	     * TASK 1 : 
	     * Create an ArrayList of integer from 1-100
	     * 
	     * get the sum of the each items 
	     * get the average
	     * 
	    */
	    ArrayList<Integer> lst = new ArrayList<>();
	    // adding 1-100 to the list 
	    for(int i=1; i<=100; i++) {
	      lst.add(i);
	    }
	    System.out.println(  lst  );
	    
	    
	    int sum = 0;
	    for (int i = 0; i < lst.size(); i++)
	    {
	      sum+= lst.get(i);
	    }
	    int average = sum/ lst.size(); 
	    System.out.println( "the average is : " + average);
	    
	    
	    
	    
	    
	    
	    
	  }

	}
