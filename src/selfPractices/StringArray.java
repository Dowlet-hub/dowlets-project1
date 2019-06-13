package selfPractices;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

		//TASK-----> Create a String Array with Capacity 4
		// put your favorite movie/show in
		//1.use the loop print them out
		//2.print the length of all items
		//3. get the max length movie title

		String[] movies = new String[4];
		
		movies[0]= "Japbaklar";
		movies[1]= "SoygininGuyji";
		movies[2]= "edho";
		movies[3]= "kurtlarVaadisi";
		
	
		System.out.println(Arrays.toString(movies));///1st task
		
		System.out.println(movies[0].length());// 2nd task
		System.out.println(movies[1].length());
		System.out.println(movies[2].length());
		System.out.println(movies[3].length());
	
		int max = movies[0].length();  // ----------> 3rd task
		int index = 0;
		for (int i = 1; i < movies.length; i++) {
			
			if(movies[i].length()>max) {
				max = movies[i].length();
				index = i;
				
				
			}
			
		}
		System.out.println(index);
		System.out.println(movies[index]);
	}

}
