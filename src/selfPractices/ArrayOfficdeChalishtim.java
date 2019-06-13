package selfPractices;

import java.util.Arrays;

public class ArrayOfficdeChalishtim {

	public static void main(String[] args) {

             //TASK1
		int [] num = { 5,8,3,10,53,67};
		// print true if all numbers are more than 10
		// if not print False  ---------> print only 1 FALSE if 1 is not correct than end your loop.
		
		boolean result = true;
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]<=10) {
				result = false;
				break;
			}
			
		}
		System.out.println(result);
		
		//TASKTASKTASKTASKTASKTASK2222222
		//
		
		String str = "Cybertek Batc Spartan is hardworking Batch ever" ;
				String[] splitWords = str.split(" ");
				System.out.println( Arrays.toString(splitWords) );// her kelimeyi ayri ayri virgulle yazmak icin
				
				String one = "Cybertek";
				char[] cyberChars  = one.toCharArray();
				
				for (int i = 0; i < cyberChars.length; i++) {
					System.out.print(cyberChars[i]+ "-");    /// dine birinji kelimani harplap yazdik
					
				}
				
				String str1 = "Cybertek Batch Spartan is hardworking Batch ever ";
				for (int i = 0; i < str1.length(); i++) {
					char[] str1Chars = str1.toCharArray();
		
					System.out.print(str1Chars[i]+"-");
					
				}
				
	}

}
