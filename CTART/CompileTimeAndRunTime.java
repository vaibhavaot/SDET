package CTART;

public class CompileTimeAndRunTime {

	public static void main(String[] args) {
		
		
		//Email em =null; (will give null pointer exception)
		Email em =new Email();
		em.generateAndSend();
		
		System.out.println(args[0]);//will give array index out of bond exception as it is currently empty
		//if empty and want to run go to run -> run config and pass arguements.
	
		
		int size =10;
		//while(true) {
			int i[]  =new int[size];
			System.out.println(i.length);
			size = size * 10;
		//}
	}

}
