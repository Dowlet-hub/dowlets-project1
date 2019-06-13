package practice;

public class prac5logicalandoperators {

	public static void main(String[] args) {
		 
		       //AND  operator &&
		System.out.println(false&&false);
		System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(true&&true);
        
        //OR operator ||
        
        System.out.println(false|| false);
        System.out.println(false|| true);
        System.out.println(true||false);
        System.out.println(true||true);
        
        boolean bools= 4>6 || 6>8;
        System.out.println(bools);
        
       
        		// NOTor Opposite Operator !
        
        System.out.println(!false);
        System.out.println(!true);
        
        System.out.println(4<6 && 2< 4);
        
        boolean b = 10 == 10 && false;
        System.out.println(b);
        
        String  drink = "tea";//"Coffee";
        Boolean hot= true;
        boolean free =true;
        
        boolean bool = drink.equals("Coffee")&& hot && free;
        System.out.println(bool);
        
        //bool = drink.equals("tea")&hot;
        bool = drink.equals("Coffee")&&hot;
        
        System.out.println(bool);
        
        //! NOT evaluated first
        //&& AND evaluated second
        //|| OR evaluated third
        
                         //false          true
        System.out.println(!(true) && true||false);
        
                 //true  true
        bool = !(1<8&&(5>2||3<5));
        System.out.println(bool);
        
        
        
      
        
        
     
        
        
        
        
        
   
        

	}

}
