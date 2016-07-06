//Created by Tejas Chaudhari
//write program to concat and remove repeating character from the string
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashMap;



public class Test3 {

	
	public static void main (String [] args)
	
	{
		String str1 = "ABCDEFJKL";
		String str2 = "ABMNOKD";
		
		String str3 = str1.concat(str2);
		
		String result = "";
		
		
		Set<Character> set1 = new HashSet<Character>();
		
		for (char c : str3.toCharArray()){
			
			set1.add(c);
		}
		
		for (char s : set1)
		{
		// To convert set to String.
		     result += s;
		}
		
		System.out.println(result);		
	}
	
	

}
