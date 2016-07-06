import java.util.Scanner;

public class Palindrome {
	
	public static void main(String [] args)
	{
		
		
		
		String str1;
		String str2 = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String to Check:");
		
	     str1 = in.nextLine();
	     
	     String stringLower = str1.toLowerCase();
		
		char arr[] = stringLower.toCharArray();
		
		for (int i = arr.length - 1; i>=0; i-- )
		{
			
			  str2 += arr[i];
				
		}
		
		System.out.println("Reversed String " +   str2);
			
		if (stringLower.equals(str2))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			
			System.out.println("String is Not a Palindrom");
		}
	}

}
