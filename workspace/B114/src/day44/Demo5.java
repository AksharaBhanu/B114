package day44;

public class Demo5 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try 
		{
			m1();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main Ends");
	}

	public static void m1() throws InterruptedException 
	{
		System.out.println("M1 Starts");
		Thread.sleep(3000);//Unhandled exception type InterruptedException
		System.out.println("M1 Ends");
	}

}
