

public class SumInRange {
	
	public static void sum (int [] arr)
	{

		int sum = 0;
		int finalSum=0;
		
		if (arr[0] == arr [1])  // if array contains equal elements
			{
				sum = arr[0] + arr[1];
				System.out.println(sum);
			}
		
		
		else if(arr[1] > arr[0])  // if 2nd element is greater than first
			{
		
		for (int i = arr[0]; i <= arr[1]; i++)       
			{
			
			sum = sum + i;
			
			}
		System.out.println(sum);
}
		else {						// first element is greater than 2nd element 
								
				for (int i = arr[1]; i <= arr[0]; i++)
				{
					sum = sum + i;
				}
	
		System.out.println(sum);
				
			}
		}
		
	public static void main(String [] args)
	{
		int [] x = {10,10};
		sum(x );
		
	}

}
