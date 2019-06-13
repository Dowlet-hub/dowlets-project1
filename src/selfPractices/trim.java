package selfPractices;

public class trim {

	public static void main(String[] args) {
		
	String str = "   GOO                               JAVA SPARTAN   ";
	//GET JAVA SPARTAN FROM THE ABOVE STRING
	int indexO = str.lastIndexOf("O");
	System.out.println(str.substring(indexO+1).trim());
	
	}

}
