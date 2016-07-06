import java.util.*;

public class ReverseWordInString_Stack {
	
	public static void main (String [] args)
	{
		
		System.out.println(reverseWord ("Hello This is Tejas"));
		
	}

	public static String reverseWord (String str)
	{
		String revStr = "";
	
		Stack<String> myStack = new Stack();
		
		String [] strArray = str.split("");
		//System.out.println(Arrays.toString(strArray));
		
		for (int i = 0; i< strArray.length; i++)
		{
			myStack.push(strArray[i]);
			
		}
		
		for (int j = 0; j<strArray.length; j++ )
		{
			revStr += myStack.pop();
			
		}
		
		
		return revStr;
	}
}
