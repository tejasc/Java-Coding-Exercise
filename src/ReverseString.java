//Created by Tejas Chaudhari
public class ReverseString {
	

 public static void main(String[] args) {
		 
		 
	 String str = "Tejas Chaudhari";
		String rev = "";
		
		char [] arr = str.toCharArray();
		
		
		for (int i = arr.length - 1; i>=0; i --)
		{
			
			rev += arr[i];
			
		}
	    
		System.out.print(rev);
	 
	 }

}
