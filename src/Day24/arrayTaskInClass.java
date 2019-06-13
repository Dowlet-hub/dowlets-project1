package Day24;

public class arrayTaskInClass {

	public static void main(String[] args) {
		// Create an char array that contains your name characters
		//create 3 array using the 3 different ways that you learned
		// print out each items of your nameArray
		
		char [] myNameChar = new char[6];
		myNameChar[0] = 'D';
		myNameChar[1] = 'O';
		myNameChar[2] = 'V';
		myNameChar[3] = 'L';
		myNameChar[4] = 'E';
		myNameChar[5] = 'T';
		
		//System.out.print(myNameChar[0]);
		//System.out.print(myNameChar[1]);
		//System.out.print(myNameChar[2]);
		//System.out.print(myNameChar[3]);
		//System.out.print(myNameChar[4]);
		//System.out.print(myNameChar[5]);
		
		
		System.out.println();
	for (int i = 0; i <6; i++) {
		System.out.print( myNameChar[i] );
	}
		
	System.out.println();
    char[] myNameChar2 = new char[] {'D', 'O', 'V','L','E','T'} ; 
    
    //for (int i = 0; i <= myNameChar2.length-1 ; i++) {
    for (int i = 0; i < myNameChar2.length ; i++) {
     System.out.print( myNameChar2[i] + " " );
    }
    System.out.println();
              
    char[] myNameChar3 = { 'D', 'O', 'V','L','E','T'};
    
    /// how do we get last items 
    int count = myNameChar3.length ; 
    
    System.out.println( "item in last index : " +  myNameChar3[count-1] );
    // how do we get the one in the middle 
    
    int midIndex = count/2 ; 
    
    System.out.println( "item in mid index : " +  myNameChar3[midIndex] );
	
	}

}
