package javaIn1Hour;

public class OOP {

	public static void main(String[] args) {
     // object olusturma

		Employee employee = new Employee();
		Employee employee2 = employee;
		 employee.id = 1;
		 employee.name = "Dowlet";
		 employee.email = "dowlet@yahoo.com";
		 
		 System.out.println("Employee 1: " + employee.name);
		 
		
	}

}
