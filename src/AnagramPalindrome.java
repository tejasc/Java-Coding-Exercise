//Created by Tejas Chaudhari

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnagramPalindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("carrace"));
		System.out.println(isPalindrome("cutoo"));
		System.out.println(isPalindrome("abcgcba"));
		
	}
	
	public static Boolean isPalindrome(String input){
		
		HashMap<Character,Integer> dupMap= new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++){
			
			if(dupMap.containsKey(input.charAt(i))){
				dupMap.put(input.charAt(i), dupMap.get(input.charAt(i))+1) ;
			}
			
			else
				dupMap.put(input.charAt(i),1);	
		}
		
		int countOdd=0;
		
	//	System.out.println(dupMap.values());
		
		for(int value  : dupMap.values())
		{
			if(value%2!=0)
				countOdd ++;
		}
	
		if(countOdd>1)
			return false;	
		else
			return true;
	}	
}