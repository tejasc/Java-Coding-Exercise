

public class LeftRotation {
	
	public static void main (String [] args)
	{
		rotate("abcdefg",4);
		rotateOther("abcdefg",4);
		
	}
	
	public static void rotate(String str, int n)
	{
		String strRotate = "";
		String concatStr ="";
		
		if (n >= str.length())
		{
			System.out.println("Enter valid number for string rotation");
		}
		
	else{
			
			concatStr = str + str;
			strRotate = concatStr.substring(n, str.length() + n);
			System.out.println(strRotate);
		}
		
		//return	concatStr.substring(n, str.length() + n);
	}
	
	
	public static void rotateOther (String str, int n)

	{
		
		String strRotate1 = "";
		int len = str.length();
		
		if (n >= str.length())
		{
			System.out.println("Enter valid number for string rotation");
		}
		
		else{
		
		for (int i = n; i<len; i++)
		{
			strRotate1 += str.charAt(i);
			
		}
		for (int j = 0; j<n; j++)
		{
			strRotate1+= str.charAt(j);	
		}

			
		System.out.println(strRotate1);	
		}
	}
	
}


