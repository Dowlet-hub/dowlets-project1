package practice;

public class prac3shorthandOperators {

	public static void main(String[] args) {
	
		int guests = 3;
		
		guests = guests + 2;
		System.out.println(guests);
		guests *=3;
		System.out.println(guests);
		
		
		int minutes =300;
		int hours = minutes /60;
		//minutes /= 60;
		System.out.println(hours);
	
		int minutess = 312;
		int hourss = minutess % 60;
		//minutess %= 60;
		
		System.out.println(hourss);
		

	}

}
