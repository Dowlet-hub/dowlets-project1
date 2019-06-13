package selfPractices;

public class ArrayTask {

	public static void main(String[] args) {

//     //create int size 5 array
//		// task1 --> double 3rd item
		int nums[]= {3,6,78,90,14};
		
		nums[2]= nums[2]*2;
//		
		System.out.println(nums[2]);
//		
//		// task 2--> update the value of 4th item to sum of 1st and 2nd item
//		
          nums[3] = nums[0]+ nums[1];
	     System.out.println(nums[3]);
//		
//		//task3-->PRINT THEM OUT USING LOOP
     	for(int i = 0; i<nums.length; i++  ) {
     		System.out.print(nums[i]+ " ");
     	}
     	
//		
	System.out.println();//ahsak ashak yazdirmak ichin
//		
//		
//		//task4--. swap first and last character

	int temp = nums[nums.length-1];
	nums[nums.length-1]= nums[0];
	nums[0]= temp;
	
	

//	int temp = nums[nums.length-1];
//	nums[nums.length-1]= nums[0];
//	nums[0]= temp;
	
	
	
	//	for(int i = 0; i<nums.length; i++) {
//    System.out.print(nums[i] + " ");
//		
//			//task5--> find out sum of all number
//			
//			int sum = 0;
//			for(int j = 0; j<nums.length; j++) {
//				sum= sum + nums[j];
//				
//			}			
//			System.out.print(sum + " ");
//			
//			//task 6----> how to find max?
			
//			int max = nums[0];
//			for(int j = 0; j<nums.length; j++) {
//				if(nums[j]>max) {
//					max = nums[j];
//				}				
//			}
//			System.out.print(max);
			
			//Task6 ----->how to find minimum?
		
		int min = nums[0];
			for(int i = 1; i<nums.length; i++) {
			if(nums[i]<min) {
			min = nums[i];	   
			
		}
			}
			System.out.print(min);           

}
}
//}
