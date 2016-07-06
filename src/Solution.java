import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public static boolean anagramPalindrome(String word) {
    
  Map <Character, Integer> dupMap = new HashMap<Character, Integer>();    
   char [] charArray = word.toCharArray();
    
  for (Character c : charArray)
  {
    if (dupMap.containsKey(c))
    {
      dupMap.put(c, dupMap.get(c)+1);
      
    }
    else {
      
      dupMap.put(c,1);
      
    }  
  }
   ArrayList values = new ArrayList(dupMap.values());
  
  int size = values.size();
  int count = 0;
  for (int i = 0; i< size; i++) {
	 int check =  (int) values.get(i);
	 if (check % 2 != 0)
	 { 
		 count++; 	 
	 }
	  
  }
  
  if (count <= 1)
  {
	  return true;
  }
  
  else {
	  
	  return false;
  }  
  
 }
   public static void main(String[] args) {
    System.out.println(anagramPalindrome("aabzbaa")); // true
    System.out.println(anagramPalindrome("cararce")); // false
  }
}