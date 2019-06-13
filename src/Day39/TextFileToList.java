package Day39;



	


		import java.nio.file.*;
		import java.util.*;

		public class TextFileToList {

			public static void main(String[] args) {

				List<String> lineLst = getTextFileAsList("DowletsFamily.txt");
				System.out.println(lineLst);//tam listeyi verir
				System.out.println(lineLst.size());///size tapyar
				
				
				//xls doc ppt pdf.... 
				String s = "erat_quisque_erat.xls";
				//how do we just get file extension?
			    String fileExtention = s.substring(s.indexOf(".")+1);
				System.out.println(fileExtention);
				
				// how to get count of file extention?
				//int count = 0;
				//for (String each: lineLst) {
					
				//System.out.println(each);
				//String fileExt = each.substring(each.indexOf(".")+1);
				//if(fileExt.contentEquals("xls")) {
					//count++;
					
					//different way of getting count of file extension.
					int count = 0; 
					for (String each: lineLst) {
						if(each.endsWith(".xls")) {
							count++;
							
						}
						
						
					
				}
					System.out.println(" excel file count is: "+count);
					//Task 2 , find out the longest file name
					
					String longest = lineLst.get(0);
					for (String each: lineLst) {
						if(each.length()> longest.length()) {
							longest = each;
							
						}
					}
					System.out.println("Longest File name: " +longest);
					
					//Task 3 : find out longest excel file
					String longestExcel = "";
					
					for (String each: lineLst) {
						if(each.endsWith(".xls") && (each.length()>longestExcel.length())) {
							longestExcel = each ;
							
						}
						
						
					}
					System.out.println(" Longest Excel file name : " + longestExcel);
					
					//Task 4 delete longest excel
					
					
					
					
				}
					
			
					
					
				
				
			//}
			/*
			 * DO NOT MODIFY AND JUST USE IT
			 * Method name : getTextFileAsList
			 * @parameter  location of text file as String
			 * 	if your file is at root path (right under project folder)
			 *  you may directly path your filename.txt
			 *  if not pass /your/own/folder/name/filename.txt as String to method
			 * 
			 * @return List of String that contain each line as per element

			 */
			public static List<String> getTextFileAsList(String filePath) {

				List<String> allLines = null;
				try {
					allLines = Files.readAllLines(Paths.get(filePath));
				} catch (Exception e) {
					System.out.println("Wrong file path probably");
				}
				return allLines;

			}
		}