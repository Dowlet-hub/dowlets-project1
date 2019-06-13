package day30;

public class NumberGame {

	public static void main(String[] args) {

    printTheDoubledNumber(10); //--->20
    printTheDoubledNumber(3);
	checkForAge(21);  //---> adult
	
	}
//////////////--------------------task-----------------------------------------------------------------------------------------
	public static void checkForAge( int age) {
		int i = age;
		if(age>18) {
		System.out.println("adult");
		
	}else {
		System.out.println(" not an adult");
	}
}
//-----------------task1--------------------------------------------------------------------------------------------------------	
	public static void printTheDoubledNumber( int num) {
		
		int doubledNum = num * 2 ;
		System.out.println(num+" was doubled --> "+doubledNum);
		//-------------------------------------------------------------------------------------------------------------------
	}
}


// Task 2 
/* 2.1
 * create a static method with no return type
 * called printTheDoubledNumber
 * it takes 1 int as parameter
 * and it will print out doubled number on the console
 * 
 * 2.2 
 * create another static method with no return type
 * called checkForAge 
 * it takes 1 int age as parameter
 * inside body , check whether the age is more than 18 
 * if the age is more than 10 --> print adult 
 * if not print not an adult  
 * 
 * */
