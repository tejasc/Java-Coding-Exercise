
public class CheckBitIsSet {
	
	static int pos = 1;

	public static boolean setBitCheck (int n)
	
	{
		System.out.println(4 & 1);
		return (n & 1 << pos) != 0;
		
		
	}
	
	
	public static void main (String [] args)
	{
	 int n =15;
	System.out.println(Integer.toBinaryString(n));
	System.out.println(setBitCheck(4));
		
	}

}
