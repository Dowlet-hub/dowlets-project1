package selfPractices;

import java.util.Scanner;

public class LoopPractise {

	public static void main(String[] args) {


		//for (int i = 1; i < 10; i++) {
			//System.out.println("Happy Birthday Mamagul!");// 1 sapardan bashlap 10 sapara cenli azdirar son durar
			                                              //sebabi 11 10 dan kich bolar 11 incide conditionimiz yalnish bolani uchin durar.
			                                              // bolani uchin durar.
			
			for(int j = 1; j > 0; j--) {
				System.out.println("Happy Birthday Mamgul!"); //bir gezek yadirip durar sebabi ikinji gezekde azaldyar 1 imiz 0 bolyar ve ishlemi bitiryar..args.
			}
			
			// How can we print given number like this: 1-2+3-4+5
			int total = 0;
			
			for (int i = 1; i < 6; i++) {
				//total += i;  beyle goshdursak 1+2+3+4+5 =15 cikarar
				
				if(i%2 ==0) {
					total -=i;
				}                    // eger sanymiz  even bolsa ayiryas odd bolsa goshyas. 
				if (i%2 !=0) {
					total +=i;
				}
			}
			
			
			System.out.println(total);
			
			//while(condition) {}   yokardakinin aynisi while loop bilen etdik
			int total2 = 0;
			int k = 1;
			
			while(k<6) {			
			      if(k%2==0) {
				   total2 -= k;
			}   
			     // eger sanymiz  even bolsa ayiryas odd bolsa goshyas. 
			if (k%2 !=0) {
				total2 += k;
			}
			k++;
		}
		
		
	System.out.println(total2);
	
	     Scanner scan = new Scanner(System.in);
	     String strInput = "";
	     for (int i = 0; i <5; i++) {
			
		
	     System.out.println(" Enter Number! ");
	     String number  = scan.next();
	     strInput += number+ ", ";
	     }
	     System.out.println("You have entered: " + strInput);
}
}

//}

