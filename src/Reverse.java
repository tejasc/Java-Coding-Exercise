//Created by Tejas Chaudhari
public class Reverse {

	 public static void main(String[] args) {
		
		 int n = 1234;
		 int value = 0;
		 
		 while (n>0)
		 {
		 int rem = n%10;   //  4      3     2     1
		 value = rem + (value*10);  // 4         400  4000
		 n = n/10;    //123   12   1   0
		 
		 }
		 
		 System.out.println(value);
	 
	 }
		 
}
