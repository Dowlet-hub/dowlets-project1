package selfPractices;

public class ArrayElifAbla {

	public static void main(String[] args) {

int [] nums = { 3,4,7,10,20,555};
   for(int i = 0; i<6; i++) {
	if(i==0) {
		System.out.print("[");
		System.out.print(nums[i]+", ");
		
	}else if (i<5) {
		System.out.print(nums[i]+", ");
		
	
}else if(i == 5) {
	System.out.print(nums[i]);
	 System.out.print("]");
}

  
	}

	}
}
