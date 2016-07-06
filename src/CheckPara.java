import java.io.*;
import java.util.*;


class CheckPara

{
	public static void main(String[] args) {

		//Stack<Character> s = new Stack <Character>();
		System.out.println(checkParenthesis("{{[}}"));

	}

	public static boolean isPair (char open, char close)
	// Create method to match parenthesis and return true
	{
		if (open == '{' && close == '}')    return true;
		if (open == '[' && close == ']')    return true;
		if (open == '(' && close == ')')    return true;
		return false;
	}

	public static boolean checkParenthesis(String str)
	{

		Stack<Character> s = new Stack <Character>();
		//Create Stack to insert element onto the stack
		char [] arr = str.toCharArray();
		// Create char array from given string expression 

		for (int i = 0; i< arr.length; i++)
			//loop through each element of an array and if its opening braces then push it on stakc
		{
			if (arr[i] == '{' || arr[i]== '[' || arr [i]== '(')
			{
				s.push(arr[i]);

			}

			else if (arr[i] == '}' || arr[i] == ']' || arr[i]== ')')
				// if its not opening brace then check for the closing brace
			{ 
				if (s.empty() || !isPair(s.peek(), arr[i]))
					// if stack is empty or if closing parenthesis doesn't match with recent opening brace(i.e top of the stack) then return false
				{
					return false;
				}
				else{
				// if it matches to the top of the stack then pop the element from the stack of the stack

					s.pop();

				}


			}

		}

		return s.empty() ? true : false;
		//finally check if stack if empty then fount all match parenthesis otherwise return false
	}

}