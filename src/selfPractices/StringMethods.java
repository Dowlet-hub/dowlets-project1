package selfPractices;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String s1 = "dave";
		String s2 = "cool";
		String s3 = "bros";
		
		String merge ;
			
        System.out.println(" "+s1.charAt(0)+s2.charAt(0)+s3.charAt(0)+// characterleri tane tane aldik her kelimeden birer tane.
		s1.charAt(1)+s2.charAt(1)+s3.charAt(1)+
		s1.charAt(2)+s2.charAt(2)+s3.charAt(2)+
		s1.charAt(3)+s2.charAt(3)+s3.charAt(3));

                    //int count = s1.length();//
                     System.out.println(s1.charAt(s1.length()-1)); //son character almak ichin
		
		String word1 = "apple";
		String word2 = "egg";
		
		int count1 = word1.length();
		int count2 = word2.length();
		
		if (word1.charAt(count1-1)==word2.charAt(0)){
			
			System.out.println(word1+word2.substring(1));///ilk kelimenin son harfi ile ikinci kelimenin ilk
			                                        //harfi ayni ise sadece birini print et.Ornek 1.Apple 2.egg-->applegg
			
		}else {
			System.out.println("Not The Same");
		}
			
                     
                     
                     
                       
	}

}
