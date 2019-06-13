package Day36;

public class WrapperClasses {

	public static void main(String[] args) {
    
		int i = 10 ;
		//byte,int,boolean,long,short,long,char,double
        
		/* 
         * 
         * 
         * 
         *///BOOLEAN
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("false");
		Boolean b2 = Boolean.valueOf(true);   //NOTE--->both way is correct
		Boolean b3 = Boolean.valueOf("true");
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		//INTEGER		
		Integer i1 = new Integer(123);
		Integer i2 = new Integer("123");
		Integer i3 = Integer.valueOf(123);
		Integer i4 = Integer.valueOf("123");
		
		
		System.out.println(i1);
		System.out.println(i2);    // we can use 2 different way
		System.out.println(i3);
		System.out.println(i4);
		
		//CHARACTER
		
		Character c1 = new Character ('c');//we can use only one way to create Character
		Character c2 = Character.valueOf('c');
		
		System.out.println(c1);
		System.out.println(c2);
		
           //Byte
	    Byte z=new Byte((byte)12);
	    Byte z1=Byte.valueOf((byte)12);
	    Byte z2=new Byte("12");
	    Byte z3=Byte.valueOf("12");
	    
	        //LONG
	    Long l=new Long(123456789);
	    Long l1=Long.valueOf(12343423324L);
	    Long l2=new Long("123123131231231");
	    Long l3=Long.valueOf("12312312332534234232");
	    
	        //SHORT
	    Short s=new Short((short)(123));
	    Short s1=new Short("123");
	    Short s2=Short.valueOf((short)(123));
	    Short s3=Short.valueOf("1232");

	    
	         //DOUBLE
	    Double d=new Double(12312.1231);
	    Double d1=new Double("123123.1231");
	    Double d2=Double.valueOf("1231212.12");
	    Double d3=Double.valueOf(123123.1231);
	    
	    
	       //FLOAT
	    Float f=new Float(12.121231212);
	    Float f1=new Float("123123.123123");
	    Float f2=Float.valueOf("1212.1212");
	    Float f3=Float.valueOf( (float) 12112.1212);
		
		
		
		
		
		
		
	}

}
