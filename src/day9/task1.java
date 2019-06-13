package day9;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			Scanner scan=new Scanner(System.in);

			int num=scan.nextInt();

			if((num/5) %3==0) {
				System.out.println("fizz buzz "); 
			}

			else if (num%3==0) {
						System.out.println(" buzz ");
					}else if(num%5==0) {
						System.out.println("fizz");
					}
				}

	}


