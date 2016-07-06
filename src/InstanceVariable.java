
public class InstanceVariable {
	
	int x = 10;
	double d;
	static int y = 25;
	// No need to initialize instance variable because JVM will provide default value to instance variable.
	
	
	
public void m()
	{
	
		System.out.println("Instance variable x from method m " + x);   // Instance variable can be access directly from instance area (non static method)
		System.out.println("Static variable y from method m " +y);	//
			}
	
public static void m2 ()
{
	InstanceVariable inst2 =  new InstanceVariable ();
	System.out.println("Static variable y from static method m2 " +y);
	System.out.println("Instance variable x from method m2 " + inst2.x);
}
	public static void main (String [] args)
	{ 
		
		InstanceVariable inst =  new InstanceVariable (); // to access instance method and variable inside static block we need to create object.
		InstanceVariable inst1 =  new InstanceVariable (); 
		inst.m();
		inst1.x = 20;
		m2();
		System.out.println("Instance variable x from main inst "+ inst.x);
		System.out.println("Instance variable x from inst1 "+ inst1.x);
		System.out.println("Instance variable d from main "+inst.d);
		System.out.println("Static variable y from method main " +y);
		
	}

}
