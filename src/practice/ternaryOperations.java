package practice;

public class ternaryOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1= 25, n2 = 10;
		
		int max;
		
		if(n1>n2) {
			max = n1;
			
		}else {
			max = n2;
			
		}
		System.out.println(max);
		
		max = (n1>n2) ? n1 : n2;
		System.out.println(max);
		
		int bill = 2000;
		
		 int discount = (bill<2000)?15 : 10;
		System.out.println(discount);
		
	    bill = 2500;
	    int quantity =12;
	   discount = (bill>2400)?(quantity>11)? 10 : 9: 5;
	   
	   System.out.println(discount);
	}

}
