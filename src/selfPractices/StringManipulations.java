package selfPractices;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		
		// substring
		String str = "Cybertek School";
		
		String str2 = str.substring(0,8);
		System.out.println(str2);
        String str3 ="Today is great day";
        str3=str3.substring(6);
        System.out.println(str3);
        
        //charAt(index):        
        String A = "ABCDABCD"; 
        System.out.println(A.charAt(2));
        
        //indexOf----char value or String value : IT RETURNS AN INTEGER         
         String A1 = "Batch 11 is a great batch";         
         int num1 = A1.indexOf('a'); //it returns first 'a'
         int num2 = A1.indexOf("at ");//it returns us index of first character.
         System.out.println(num1);
         System.out.println(num2);
        
        //lastIndexOf      
         String A2 = "ABCDEABCD";
         int num3 = A2.lastIndexOf("A"); //en sondaki  A'nin indexini berer
         System.out.println(num3);
        
        // concat(); IT WILL AD VALUE TO THE STRING         
         String i = "Cybertek".concat(" School");
         System.out.println(i);// output will be ----->Cybertek School
         
         //replace(StrOld, it takes char or String value StrNew(char)         
         String word = " Java";
        word = word.replace("a", "e");  //String immutable oldugu ichin onune taze word assign etdik...
         System.out.println(word); // it will replace all letters...
         
         //replaceFirst(); it replace first accured value.  it accepts only String
         String word2 = "Java";
         word2 = word2.replaceFirst("a", "e");// it will replace only first letter
         System.out.println(word2);
         
         word2 = word2.replace("va" , "vz"); // v' den sonki harpi degishdirer.
         System.out.println(word2);  
         
         //   replace with scanner
         
         Scanner scan = new Scanner(System.in);
         
         String strScan = scan.next();
         
         strScan = strScan.replace(strScan, strScan.toUpperCase());        
         System.out.println(strScan);
         
         strScan = strScan.substring(0,1).toUpperCase()+strScan.substring(1).toLowerCase();
         System.out.println(strScan); // sozin birinji harpini uli galanlaryny kich harplar bilen yazar. input nahili bolsa bolaysin 
   
         // how to reverse
         String reversedName = "";
         for (int j = strScan.length()-1; j>=0; j--) {
        	 reversedName += strScan.charAt(j);               // bunun la asakdaki
        	// reversedName = reversedName + strScan.charAt(j); // ikisi de ayni
		}
         System.out.println(reversedName);
			
         // how to reverse substring way
         String reversedName2 = "";       
         for (int j = strScan.length()-1; j>=0; j--) {
         reversedName2 = reversedName2 + strScan.substring(j, j+1);//girilen sozun in sonkisindan bashlap +1 goshup git
         }
         System.out.println(reversedName2);
         
	
	}

}
