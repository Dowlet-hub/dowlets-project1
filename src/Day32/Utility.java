package Day32;

public class Utility {

	public static void main(String[] args) {


		String name = "Emine";
				
				
		
         System.out.println(name.charAt(1));
         char c = name.charAt(1);
         System.out.println(c);
         giveMe5();
        System.out.println(giveMe5());      
         /// we can  also use className.staticMethod(parametrs) to call static methods
         System.out.println(Utility.giveMe5());
 		
	}

	public static int giveMe5() {
		return 5;
		
		
	}
}
