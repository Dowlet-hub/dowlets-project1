package Day34;

public class VarArgs2 {

	public static void main(String[] args) {

		
	String dog = null;
	System.out.println(dog.length());
		
		printNames("Zukhra", "Finda", "Alina","Odiljan","Sharif","Ahmad","Bayram"+"Firdevs","Ansar");
		
		printNames("Maryam","Ameria","Hatice");
		
		printNames();
		// we can pass as many argumnet as possible for varArgs includin null for any reference type
		printNames(null, "not empty", "");
		
		
		 
		
	}
	
	public static void printNames( String ... names) {
	
		//String[] names = {null,not empty"," "};
		//names are treated as String[] that have whatever variable numbers of argumnets from method call
		
		//System.out.println(	names[0]);
		//System.out.println(	names[3]);
		
		System.out.println("You passed " + names.length + " arguments");
	}

}
