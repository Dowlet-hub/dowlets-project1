package selfPractices;

public class ArrayPractice {

	public static void main(String[] args) {


		String[] names= {"Dovlet", "Yakup", "Allanur", "Ovez" , "Rovshen"};
		System.out.println(names[3]); //3 positiondakini aldi, 0 dan abshlanyar hemish
		
		System.out.println(names[names.length-1]);// son positiondakini almak uchin
		
		names[0] = "Dovletmammet";// replace etmek uchin
		System.out.println(names[0]);
		
		
		//Task1
		
		// create an char array that contains your name characters use 3 different way...
		
		char[] myName1 = new char[6];///1st way
		myName1[0]= 'D';
		myName1[1]= 'O';
		myName1[2]= 'V';
		myName1[3]= 'L';
		myName1[4]= 'E';
		myName1[5]= 'T';
		
		//System.out.println(myName1);///or we can use for loop
		
		for(int i = 0; i<6; i++) {
			System.out.print(myName1[i]);
		}
		System.out.println();//bosh print etmek uchin ulandik
		
		char[]myName2 = new char[] {'D','O','V','L','E','T'};//2nd way
		
		for(int i = 0; i<myName2.length; i++) {
			
			System.out.print(myName2[i]+ " ");
			
		}
		
		System.out.println();
			
		
		char[] myName3 = {'D','O','V','L','E','T'};//3nd way
		
		
		//how do we get last item		
		int count = myName3.length;
		System.out.println("item in last index is: " +myName3[ count-1]);
		
		// HOW TO GET ONE IN THE MIDDLE
		
		int midIndex= count/2;
		System.out.println("item in the middle is: " +myName3[ midIndex-1]);//cift sanlarda ortadan bolup sag tarapdakini beryar
		                                                                     // tek sanlilarda direk ortadakini beryar
		
		//HOW TO REVERSE AN ARRAY ITEMS
		System.out.print(myName3[5] + " ");
		System.out.print(myName3[4] + " ");
		System.out.print(myName3[3] + " ");
		System.out.print(myName3[2] + " ");
		System.out.print(myName3[1] + " ");
		System.out.print(myName3[0] + " ");
		
		for(int i = 0; i>myName3.length; i--) {
			System.out.println(myName3[i]);
		}

			
	}

}
