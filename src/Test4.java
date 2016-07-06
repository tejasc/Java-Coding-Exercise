// Created by Tejas Chaudhari
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Test4 {

	public static void main(String[]args)
	{
		
		String str1 = "abdc23$%123";
		String str2 = "frged456*7adb43";
		String str3 = str1.concat(str2);
		
		System.out.println(str3);
		
		String result = "";
		
		Set<Character> set1 = new HashSet <Character>();
		
		for (char c : str3.toCharArray())
		{
			if (!set1.contains(c))
			{
				set1.add(c);
				
			}
			
		}
	
		
		for (char c : set1)
		{
			// To convert set to String.
			System.out.print(c);
		}
		
		
		
		//System.out.println(set2);
		
		
		
		
	}
}

