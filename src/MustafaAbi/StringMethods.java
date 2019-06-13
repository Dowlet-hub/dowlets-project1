package MustafaAbi;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {


	      String tersi = "";          
	     String mama  = "Mamagul Atamammedova";
         for(int i = mama.length()-1; i>=0; i--) {
         tersi += mama.charAt(i);
}
         System.out.println(tersi);
	}

}
