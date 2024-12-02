package day44;

public class Demo2 {
//normal termination
//abnormal termination	
//graceful termination	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try 
		{
			m1();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main Ends");
	}

	public static void m1() throws ArithmeticException  //exception delegation
	{
		System.out.println("M1 Starts");
		System.out.println(10/0);
		System.out.println("M1 Ends");
	}
}
