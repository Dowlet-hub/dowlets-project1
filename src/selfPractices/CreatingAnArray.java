package selfPractices;

public class CreatingAnArray {

	public static void main(String[] args) {


		// once array is created with a given size
		//it can not be changed later
		int [] numbers = new int[3];///assigning value to array
		
		// 2nd way to create an array with predifined items without assigning size...
		
		int [] nums = new int [] {3,15,7,8,9,-2};///later we can not change size or values later, but we can resign in the buttom
		
		//getting the size of an Array
		int size = nums.length;
		System.out.println(size);
		
		nums[0] = 100;
		System.out.println(nums[1]);
		System.out.println(nums[size-1]); // son karakteri almak uchin size hem ulanmali
		
		// 3rd way of creating an Array
		
		int[] nums2= {100,3,5,7,8,4,-5,-9};
		System.out.println(nums2.length);
		System.out.println(nums2[0]);
		
		
		
		

	}

}
