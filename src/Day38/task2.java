package Day38;

import java.util.ArrayList;

public class task2 {

	public static void main(String[] args) {


		 /* Create another list that contain items from 100- 1 
	     * get the count of numbers divisible by 3 and 5 
	     *
	     * OPTIONAL 
	     * Combine above 2 lists -- add everything from 2nd list to first one
	     * 
	     * Update every odd items to 0 ; 
         * 
         */ 
		
	    ArrayList<Integer> lst = new ArrayList<>();
	    // adding 1-100 to the list 
	    
	    for (int i = 100; i > 0; i--) {

	      lst.add(i);

	    }
	    System.out.println(lst);
	    
	    int count = 0 ; 
	    for(Integer each: lst) {
	      
	      if(each%3==0 && each%5==0)
	        count++ ; 
	           
	    }
	    System.out.println("The target count is : " + count);
	    
	    
	    //Optional
	    ArrayList<Integer> lst1 = new ArrayList<>();
	    // adding 1-100 to the list 
	    for(int i=1; i<=100; i++) {
	      lst1.add(i);
	    }
	    System.out.println(  lst1  );
	    
	    
	    ArrayList<Integer> lst2 = new ArrayList<>();
	    // adding 1-100 to the list 
	    for (int i = 100; i > 0; i--) {
	      lst2.add(i);
	    }
	    System.out.println(lst2);
	    
	    // the logic is : pick each and every item in lst2 and add it to lst 1 
	    
	    for (int i = 0; i < lst2.size(); i++) {
	      //System.out.println( lst2.get(i) );
	      Integer eachIn2 = lst2.get(i)  ; 
	      lst1.add( eachIn2  ) ; 
	    }
	    
	    System.out.println(lst1);
	    
	   


	
	
	}

}
