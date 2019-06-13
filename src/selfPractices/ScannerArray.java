package selfPractices;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
//		System.out.println("Enter First Number");		
//        arr[0] = scan.nextInt();
//        System.out.println("Enter Second Nmber");
//        arr[1] = scan.nextInt();
//        System.out.println("Enter Third Number");
//        arr[2] = scan.nextInt();
        
        for(int i = 0; i<arr.length; i++) {
        	System.out.println("Enter Number " + (i+1));
        	arr[i] = scan.nextInt();
        	 System.out.print(arr[i]);
        }
       

		int min = arr[0];
			for(int i = 1; i<arr.length; i++) {
			if(arr[i]<min) {
			min = arr[i];	   
			
		}
			}
			System.out.print("Minimum number is: " + min);   
	}
	
}
