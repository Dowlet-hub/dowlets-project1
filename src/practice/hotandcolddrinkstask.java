package practice;

public class hotandcolddrinkstask {

	public static void main(String[] args) {
		
		int typeSelection = 1;
		int drinkSelection = 1;
		
		double price;
		String drink;
		
		if(typeSelection ==1) {
			System.out.println("Hot Drinks 1: 1-tea. 2- Coffee");
			if(drinkSelection ==1) {
				price = 2.0;
				drink = "Tea";
				
			}else if (drinkSelection ==2) {
				price = 4.0;
				drink = "Coffee";
				
			}else {System.out.println("invalid hot drink selection");
				
			}
		}else if(typeSelection ==2) {
		      }System.out.println("Hot Drinks 2: 1-Iced tea.2-Lemonade");
			if(drinkSelection ==1) {
				price = 3.2;
				drink = "Iced tea";
				
			}else if (drinkSelection ==2) {
				price = 3.5;
				drink = "Lemonade";
				
			}else {
				System.out.println("invalid cold drink selection"); 			
			}
				
				
		
			
	
		
		

	}

}
	
