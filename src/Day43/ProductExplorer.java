package Day43;

public class ProductExplorer {

	public static void main(String[] args) {

	    
	    Product p1 = new Product(); 
	    //p1.name = "someyhin"; 
	    p1.initilizeAllFieldValues("Watch", 4.5f, 113.39,"x123");
	    
	    System.out.println(  p1.getName()  );
	    System.out.println(  p1.getRating()  );
	    System.out.println(  p1.getPrice()  );
	    System.out.println(  p1.getProductId()  );
	    
	    // 20 $ sale is on going , change the value of price
	    p1.setPrice(113.39 - 20);
	    
	    
	    
	    
	    
	  }

	}
