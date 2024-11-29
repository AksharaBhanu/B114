package day43;

public class Demo14 {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e)
		{

			e.printStackTrace();
		}
		
		System.out.println("Bye");

	}

}
