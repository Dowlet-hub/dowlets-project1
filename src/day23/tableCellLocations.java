package day23;

public class tableCellLocations {

	public static void main(String[] args) {
		
		
		//create a program to print out each location of cell in this format
		//table with 2 column and 2 row
		//cell (1,1) cell (1,2)
		//cell (2,1) cell (2,2)
		//given you have 3 row and 4 column
		
	
      /* for (int i = 1; i<=3; i++ ) {
    	  System.out.println("Row : " + i); 
    	   
       }
       for (int x = 1; x<=4; x++ ) {
    	  System.out.print("Column : "+x+" "); 
       }*/
		
		for (int i = 1; i <= 3; i++) {
			  System.out.println("Row : " + i);
			  for (int x = 1; x <= 4; x++) {

			    System.out.print("Column : " + x + " ");

			  }
			  System.out.println();
			}

	}

}
