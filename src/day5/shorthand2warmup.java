package day5;

public class shorthand2warmup {

	public static void main(String[] args) {
		// Declare a variable offerCount and give initial value of 1 ;
		//lets imagine you got five offer today
		
		int offerCount = 1;
		offerCount +=5;
		offerCount -=2;
		offerCount *=4;
		offerCount /=2;
		offerCount = offerCount%5;
		System.out.println(offerCount);

	}

}
