package selfPractices;

import java.util.Arrays;

public class ArrayWarmUp {

	public static void main(String[] args) {


		int [] nums = new int[50];
		
		for (int i = 0; i <50; i++) {
			nums[i] = i+1;
						
		}
		   System.out.println( Arrays.toString(nums));
		
	int[] evenNumbers = new int[51];
		   for (int j = 0; j <= 50; j++) {
			   evenNumbers [j] = j*2;
			  
		}
		   System.out.println(Arrays.toString(evenNumbers));
	}

}
