package variable;
/**
 * local variable:
 * lifetime : created at the beginning of method execution and destroyed at the end of method execution
 * scope : visible only in the method or block where it is declared
 * 
 * Instance/member variable:
 * lifetime : Created when an object is created and destoryed when a the obj is garbage collected 
 * scope : Visible to all the method in the class and created per each object of the class and can be used by calling this method.
 * 
 * class/static variable:
 * lifetime: Created when the program starts(loaded by JVM) and destroyed when the program quits.
 * scope : Visible to all the methods in the class and created per class.
*/

public class VariablesDemo 
{
	
	//int a =20;//instance variable 
    static int a =20; // static/class variable 
	private void method1() 
	{
		int a =10;//local variable
		//System.out.println("value of local variable A:"+a);
		//System.out.println("value of instance variable A with this method:"+this.a);
		this.a =30;
	}
	private void method2() 
	{
		System.out.println("Value of instance variable A:"+a);

	}

	public static void main(String[] args) 
	{
		VariablesDemo demo1 = new VariablesDemo();
		demo1.method1();
		demo1.method2();
		
		VariablesDemo demo2 = new VariablesDemo();
		demo2.method2();

	}

}
