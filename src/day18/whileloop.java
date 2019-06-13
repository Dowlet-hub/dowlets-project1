package day18;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		
		/*int x = 10 ;
		
		if(x>5) {
			System.out.println("DO THIS");
		}else {
			System.out.println("DO THAT");
		}
		
		// while(as long as some condition is true{ repeat this action}
		int y = 10 ;
		while(x>5) {
			System.out.println("do this"+y--); //1 sandan azaldar sonsuza kadar//  ++ goshar bir san sonsuza cenli          
		    // y--;//1 sandan azaldar sonsuza kadar
			 //// if you do not stop it it will crash your ram!!!
		
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter your target Number");
		
		int targetCount = scan.nextInt();
		int x = 1;
		while(x<=(targetCount/2)){
			System.out.print(x++ +" ");
			
		}
		
		 //int x = 100;
		// while(x>200) {
			// System.out.println("do something");
			//++x;// name goysanam END chikarar sebabi condition yalnish....
			
			
			 
		// }
		 
		//System.out.println("END");
	}

}
