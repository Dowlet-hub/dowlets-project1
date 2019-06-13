package Day41;

public class Car {

	private String make ;
	private String color ;
	private String bodyType ;
	
	private String accelerate()	{
	
		String motion = "Accelerating...";
		return motion;
	}
		
public void setVeichle(String brand, String paint, String style) {
	


	make = brand ;
	color = paint ;
	bodyType = style ;

  }

public void getVeichle() {
System.out.println(make+ " paint is " + color);
System.out.println(make + " style is " + bodyType);
System.out.println(make + " is " + accelerate() + "\n");

}
}