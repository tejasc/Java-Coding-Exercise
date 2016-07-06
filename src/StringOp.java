import java.util.Scanner;

public class StringOp {
	
	public static void main( String [] ars)
	{
		String s1, s2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter two strings");
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		String s3 = s1.concat(s2);			//concat strings
		
		System.out.println("Result of concatination "+s3);	
		int l1 = s1.length();
		int l2 = s2.length();
		
		System.out.println("Length of s1 String " +l1);
		System.out.println("Length of s2 String " +l2);
		
		s1= s1.toUpperCase();
		s2 = s2.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	
	
	

	
}
