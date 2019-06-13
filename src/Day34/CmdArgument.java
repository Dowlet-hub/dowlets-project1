package Day34;

public class CmdArgument {

	public static void main(String... args) {

         System.out.println(args.length);
         for(String item: args) {
        	 System.out.println(item+" ");
         }
		

	}

}
