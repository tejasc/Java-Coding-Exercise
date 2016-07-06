import java.util.*;
public class FirstNonRepeat {

	public static void main(String []args){
		
		
		firstNonRepeat("hi i am tejas chaudhari");
		
		
	}
	
	public static void firstNonRepeat(String str) {
		
		// First of all we will trim the blank spaces from our string
		
		String newStr = str.replaceAll("\\s", "");
		
		// If we are considering uppercase letter and lowercase letter similar then we have to use toLowerCase method to convert string all characters to lowecase
		
						//System.out.println(newStr);
		
		// Create Hashmap to store character and their count in key value pair
		
		Map<Character, Integer> hmap = new HashMap();
		
		for (int i = 0; i<newStr.length(); i++)
		{
			Character ch = newStr.charAt(i);
			
			if(hmap.get(ch) == null)
			{
				hmap.put(ch, 1);
			}
			else
			{
				hmap.put(ch, hmap.get(ch) +1);
			}
			
		}
		
		// Now we have hashmap that contains our character as key and count as its value
		// To check first non repeating character we have to check each character in sequence of original string
		
		int j;
		
		for(j = 0; j<newStr.length(); j++)
		{
			Character ch = newStr.charAt(j);
			if(hmap.get(ch) == 1)
			{
				System.out.println("First Non Reapeating Character " +ch);
				break;
			}
			
		}
		
		if (j == newStr.length())
		{
			System.out.println("No non Reapeating Character in string");
		}
			
	}
	
	
}
