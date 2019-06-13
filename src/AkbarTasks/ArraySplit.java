package AkbarTasks;

import java.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) {

// Task1-----> Create a String called groceries
		     // add items separated by comma
		     // split them and print them out
		     // find out size of split
		     // find out length of each items
		
		String groceries = "tomatoes, bananas, cucambers, peaches, apples, strawberries";
		String [] splitedGroceries =  groceries.split(",");
		System.out.println(splitedGroceries.length);
		System.out.println(Arrays.toString(splitedGroceries));
		
		for (int i = 0;  i< splitedGroceries.length; i++) {
			System.out.println(splitedGroceries[i]);
		}
		
		
	}

}
