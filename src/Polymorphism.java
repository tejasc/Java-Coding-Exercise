
public class Polymorphism {
	
//	public static void showMain()
//	{
//		System.out.println("Hi from static method");
//		
//	}
	public void showMain()
	{
		System.out.println("Hi from non-static method");
		
	}
	
	public static void main (String [] args) {
		
		A obj = new A ();
		
		obj.show(5);
		obj.show();
	
		Polymorphism poly = new Polymorphism();   // to call non static method from static we need to create object.
		poly.showMain();
		
	}

}


class A {
	
	public void show ()
	{
		System.out.println("Hello");
		
	}
	
	public void show (int i) {
		
		System.out.println("Hi " + i);
	}	
	
	
}
