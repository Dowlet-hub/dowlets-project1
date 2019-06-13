package javaIn1Hour;

public class Metodlar {
	
	public static int add(int a, int b, int c) {
		return (a+b+c);
		
	}
    public static int add(int a, int b) {             // public hemme yerden erisilebilir, 
    	//System.out.println("total of:" + (a+b));                                              //static main methodunda direk olarak kullanmak ichin 
    	 return (a+b);                                             // void return bilen cagirilan yerineherhangi bir deger bermesin diyip kullanyaris
    	
    }
	public static void main(String[] args) {
               //
               //     add(10,20);    //a bilen b,ye degeri baride berdik ve methodin adi bilen cagirdik
  //METODLAR UCHIN KULLANDIK            //	 add(20, 30);
             //	   //int a = add(50,10);            //diyip bilemizok sebabi void bar yokarda BUT,
             //        int total =  add(50,10)+add(40,20);                      // voidin yerine int yazsam            
            //	
             //	System.out.println("Total: " +total);
          
	///Method Overloading*********************************************************************************************************
	
	         System.out.println(add(10,20));   
	         //System.out.println(add(10,20,30));   // iki sani int int bar bolani uchin 3"nci degeri girenimizde hata berdi
	                                                // shonun uchin yokarda tazeden method olushturmali add(int a, int b, int c) olarak
	        System.out.println(add(10,20,30)); 
	}

}
