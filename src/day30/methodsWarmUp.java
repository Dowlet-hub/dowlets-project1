package day30;

public class methodsWarmUp {

	public static void sayHello() {
		System.out.println("Greeting Spartans");
	}
	
	
	public static void sayGoodBye() {
		System.out.println("Bye Spartans");
	}
	
	public static void sayHelloTo(String name) {
		System.out.println("Greeting, " +  name);
	}
	
	
	public static void main(String[] args) {
		
		sayHello();
		sayGoodBye();
		sayHelloTo("300 spartans");
		sayHelloTo("dowlet");
		//sayGoodBye();
	}

	
	
	
	}
	
//WARM UP
//1, Create a static method
//called  sayHello :
//this method return nothing
//and does not take any parameter
//
//and it will greeting spartan
//
//2, Create a static method
//called  sayGoodBye :
//this method return nothing
//and does not take any parameter
//
//and it will good bye spartan
//
//3, Create a static method
//called  sayHelloTo :
//this method return nothing
//and take 1 String name as parameter
//
//and it will greeting --the Name You passed
