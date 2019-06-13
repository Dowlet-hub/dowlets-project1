package practice;

public class string {

	public static void main(String[] args) {
		
		int x = 67;
		
		String result = "unknown";
		
		if(x>70) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
			
			result = (x>70) ?"pass": "fail";
			System.out.println("my result is" + ((x>70) ? "pass":" fail"));
		}
		
		
	
	}

	private static void result(Object object) {
		// TODO Auto-generated method stub
		
	}

}
