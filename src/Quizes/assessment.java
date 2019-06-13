package Quizes;

import java.util.ArrayList;

public class assessment {

	public static void main(String[] args) {
		
		//1)what's the result of the following code fragment?
		
		// remove method has returned-----> oldValue
		int a = 1;/// this is primitive,list.remove(a); list treats this variable as a position(index) not like a value.

		ArrayList<Integer>  list= new ArrayList<>();

		list.add(3);

		list.add(2);

		list.add(1);

		 

		System.out.println( list.remove( a )  ); //birinci pozisyondakini sildi olam ----->2  
		                                         //a== 1  di shonun uchin 1 pozisiondakini sildi
		
		//2)what's the result of the following code fragment?
		
	
			Integer b=1;   //this is object  ---wrapper class--java automatically auto boxing primitive type and returning to the object

			ArrayList<Integer> list1= new ArrayList<>();

			list.add(3);

			list.add(2);

			list.add(1);

			System.out.println( list.remove( b ) );   //listede 1 position bar bolani uchin TRUE jogap,,
			                                          //eger INTEGER B == 4 bolan bolsa listede yok bolani uchin FALSE cikardi jogap
                                                       // objective bolani uchin boolenda beryar resulti
			
			
			
			}

		}

	

