package selfPractices;

public class FindMaxAndMinArray {

	public static void main(String[] args) {


		int nums[] = {377,2453,2,5,66};
		
		int max = nums[0] ;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		System.out.println(max);
	}

}
