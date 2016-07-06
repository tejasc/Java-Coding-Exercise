
public class ReverseWord {

		public static void main (String [] args)
		{
			
		System.out.println(reverse("Hello This Is Tejas"));
			
			
		}
		
		public static String reverse (String str)
		
		{
			String revStr = "";
			String revWord = "";
			
			String [] strArray = str.split(" ");
			
			//System.out.println(strArray);
			
			int len = strArray.length;
			
			System.out.println(len);
			
			for (int i = 0; i< len; i++) {
				
				for (int j = strArray[i].length() -1 ; j>=0 ; j-- )
				{
					  
					revWord += strArray[i].charAt(j);
					
				}
				
				revWord += " ";
			}	
			
			revStr += revWord;
			
			
			return revStr;
		}
		
	
}
