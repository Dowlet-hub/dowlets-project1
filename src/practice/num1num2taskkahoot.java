package practice;

public class num1num2taskkahoot {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 8;
		
		num1--;
		num2++;
		
		int max;
		
		max = (num1>num2) ? num1 : num2;
        //System.out.println("my result is:"+ max);
		//System.out.println("my result is:" + ((num1>num2) ? num1 : num2));
		System.out.println(10 + ((num1++>--num2) ? num2 : num1));
		//System.out.println(num1);
	}

}
