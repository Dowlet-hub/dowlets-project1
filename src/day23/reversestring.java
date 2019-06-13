package day23;

public class reversestring {

	public static void main(String[] args) {
	/*	//            012345
		String str = "Goksel" ; 
		String reversed = "";//to store we need this empty container
		
		for(int i = str.length()-1 ; i>=0 ; i--) {
			//System.out.println(i);
			reversed += str.substring(i,i+1);
			System.out.println(reversed);
			//System.out.println(str.substring(i, i+1)) ;
			
		}*/
		
        //012345
   String str = "Goksel" ; 
   String reversed = "" ; 
   
   for (int i = str.length()-1 ; i>=0  ; i--) {
   
     reversed += str.substring(i,i+1) ; 
     //System.out.print( str.substring(i,i+1)   );
   
   }
   System.out.println(reversed);
	}

}
