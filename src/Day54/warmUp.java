package Day54;

public class warmUp {
	
	int num = 100;
	
	{
		//num =150;
		System.out.println( "init block 1");
		
	}
	
	public warmUp() { ////constructor eken bular
		num = 200;                           // dine shu chikyar outputta instance block bolani uchin
		 System.out.println("init block 2 ");
	}
	
	public warmUp (int x) {
		num = 400;
	}

	public static void main(String[] args) {


		warmUp w = new warmUp();
		System.out.println(w.num);
		
	}

}
