package Day36;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {

  // No primitive type allowed as type
	// ArrayList<int>numList ; THIS IS BAD CODE	
		//arrayList that store only Integer
		ArrayList<Integer> numList = new ArrayList<>(); // correct one
		//numList.add("ABC"); it has to be number only nut STRING(wrong)
		
		
		Integer i = 100; // autoboxing to Integer Object	
		
		// adding item
		//we call add method from Array List class
		
		numList.add(i);		
		numList.add(200);
		numList.add(300);
		
		//Getting single item from arraylist
		//we call get(index) of ArrayList
		Integer i1 = numList.get(0);
		int i2 = numList.get(1);// auto unboxing happened here
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(numList.get(2));
		
		// we can directly see what is inside		
		System.out.println(numList);
	}

}
