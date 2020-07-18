package SDET.passbyval;
/**
 * pass by value or pass by reference 
 * java is always 'pass by value' which means it copies the argument(but not pass the original variables)
 * there are 2 types of variable you can pass to the methods, primitive and reference variables(both are pass by value)
 * 
 * what are stack and heap memory?
 * stack and heap memory are two primary memory areas used by JVM
 * Stack - Methods and local variables (both primitive and reference variables) are stored in stack.
 * Heap - Objects and instance variables are stored in Heap.
 */

public class PassByValue 
{
	public static void main(String[] args) 
	{
	long id =111;// id is primitive variable
	Report rep = new Report();//rep is reference variable
	
	incrementId(id);//passing primitive variable
	System.out.println("after calling incrementId:" +id);
	
	updateTitle1(rep);//passing reference variable 
	System.out.println("after calling updateTitle1:" +rep.title);
	updateTitle2(rep);//passing reference variable
	System.out.println("after calling updateTitle2:" +rep.title);
	}

	static void updateTitle2(Report rep) 
	{
		rep.title = "updated";
		
	}

	static void updateTitle1(Report rep) 
	{
		rep =new Report();
		rep.title="copy";
		
	}

	static void incrementId(long id) 
	{
		id = id +1;
		
	}

}
