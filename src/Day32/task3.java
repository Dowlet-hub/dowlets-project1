package Day32;

public class task3 {

	public static void main(String[] args) {


		 // TASK 3 :
		  
		  // CREATE static method called giveMeBiggerNumber
		  // it takes 2 byte as parameter 
		  // and return bigger number 
		  
		  // call the method couple times with different result 
		 
	     int biggerNum = giveMeBiggerNumber(10, 12) ; 
	     System.out.println(biggerNum);
	     
	     System.out.println(giveMeBiggerNumber(100, 11) );
	     
	  
	  }
	  
	  public static int giveMeBiggerNumber(int num1 , int num2) {
	    
	    int max =  (num1>num2) ? num1 : num2 ; 
	    return max ; 
	    // return (num1>num2) ? num1 : num2 ;  	

	}

}
