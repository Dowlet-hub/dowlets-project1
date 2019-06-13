package Day41;

public class SafeInstance {

	public static void main(String[] args) {
		
		Car Porsche = new Car();
		
		Porsche.setVeichle("Porsche", "Red" , "Coupe");		
		Porsche.getVeichle();
		
	    Car Bentley = new Car();
		Bentley.setVeichle("Bentley"," Green" , "Saloon");
		Bentley.getVeichle();
		
		System.out.println();

	}

}
