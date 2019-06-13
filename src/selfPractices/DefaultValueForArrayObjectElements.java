package selfPractices;

import java.util.Scanner;

public class DefaultValueForArrayObjectElements {

	public static void main(String[] args) {


//		int [] nums = new int[3];
//		nums[1] = 100;
//		
//		System.out.println(nums[0]);  //output will be 0 because we did not assign value to the 1st index
//		System.out.println(nums[1]);  //output is 100 because we assigned 100 to the 2nd index/position
//		System.out.println(nums[2]);  ////output will be 0 because we did not assign value to the 1st index
//		
//		
		boolean [] arr1 = new boolean[3];
		System.out.println(arr1[0]);
		
		char [] arr2 = new char[3];
		System.out.println(arr2[0]); //outputta bosh yer goruner , because we did not assign value for char---. ACCII code 0 is empty
		                             // all other primitive types wil output 0 , because we did not assign any value
		int [] arr3 = new int[3];
		System.out.println(arr3[0]);
		
		float [] arr4 = new float[3];
		System.out.println(arr4[0]);
		
		double [] arr5 = new double[3];
		System.out.println(arr5[0]);
		
		byte [] arr6 = new byte[3];
		System.out.println(arr6[0]);
		
		short[] arr7 = new short[3];
		System.out.println(arr7[0]);
		
		long [] arr8 = new long[3];
		System.out.println(arr8[0]);
		
		String [] arr9 = new String [9];
		System.out.println(arr9[0]);  // String is not primitive that is why we will get NULL because it has leash but no dog.
		
		Scanner [] arr10 = new Scanner [3];
		System.out.println(arr10[0]);
		
	
		
		
		
		
		

	}

}
