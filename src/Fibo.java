
public class Fibo {

	static long a = 1, b = 2, c = 1;
	
	public static void main(String [] args)
	{
		calc(5);
		
		System.out.println(c);
		
	}
	
	static void calc(int n)
	{
		
	for (int i=1; i<n; i++ )
		{
		c = b*2;
		b = c;
		//b = c;
	 }	
}
}