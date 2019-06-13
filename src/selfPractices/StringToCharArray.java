package selfPractices;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {


		String str = "Spartan";
		
		// Task turn String to char
		
		char myChar[] = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			myChar[i] = str.charAt(i);
			System.out.println(Arrays.toString(myChar));
		}

	}

}
