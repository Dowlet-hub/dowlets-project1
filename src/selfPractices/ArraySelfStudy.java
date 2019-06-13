package selfPractices;

import java.util.Scanner;

public class ArraySelfStudy {

	public static void main(String[] args) {

         int i1 = 10;  // this is holding only one value 
         int i2 = 20;  //but array you can store multiple same type of values inside of one Container/Variable
         int i3 = 30;
         int i4 = 40;
         int i5 = 50;             
        
         // we declared int array variable
         // and we assigned int array object that has 5 capacity
        //5 capacity  has in this container// int type items...
        
         int [] numbers = new int [5];
          
         // assigning value to array
         numbers [0] = 10;
         numbers [1] = 15; // index starts with 0 always and last item is one less
         numbers [2] = 28;
         numbers [3] = 20;
         numbers [4] = 3;
         
         System.out.println( numbers[0]);  // dine 0 yada dine numbers diysek dogry print etmez...
         
         //TASK1
          //Create an array of double with size 4
         // assign 4 value
         // print them all out
         
         double [] doubleNumbers = new double [4];
         
         doubleNumbers [0] = 40.0;
         doubleNumbers [1] = 12.99;
         doubleNumbers [2] = 42.89;
         doubleNumbers [3] = 10.99;
         
         System.out.println(doubleNumbers[0]);
         System.out.println(doubleNumbers[1]);
         System.out.println(doubleNumbers[2]);
         System.out.println(doubleNumbers[3]);
         
         //TASK2
         // declare boolean array variable that point to
         // array of size 5
         // declare short variable
         //declare String array variable
         //declare Scanner array variable
         
         boolean[] booleanVar = new boolean[5];  // this has capacity size of 5
         
        // short[] shortVar  =  ;  // here just declared  primitive typevariable no size
         short[] shortVar  = new short[2] ;// with capacity 2 
         
        // String[] stringVar ; // here just declared  non primitive type variable no size
         String[] stringVar = new String[20];
         
         //Scanner[] scannerVar ; // here just declared non primitive type variable no size
         Scanner[] scannerVar = new Scanner [15];
         
        
		
	}

}
