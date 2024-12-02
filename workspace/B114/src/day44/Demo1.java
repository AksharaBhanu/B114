package day44;

public class Demo1 {
//normal termination
//abnormal termination	
//graceful termination	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");
	}

	public static void m1()
	{
		System.out.println("M1 Starts");
		try 
		{
			System.out.println(10/0);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("M1 Ends");
	}
}
