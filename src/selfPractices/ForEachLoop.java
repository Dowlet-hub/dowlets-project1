package selfPractices;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		int[] ints = {34,44,22,5,6,678};
		
		for(int item: ints ) {
			if(item%2==0) {
				System.out.println("items: " + item);	
			}
			
		
			
		
			}
		String[] str = {"aaa","bb","cc","dd","abc"};
		
		for( String letters: str) {
			
			if(letters.contains("b")) {
				System.out.println("letter b found exit");
				break;
			}
			System.out.print(letters + " ");
		}
	}

}
