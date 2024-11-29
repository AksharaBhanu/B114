package day43;

public class Demo7 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		int a=10,b=2;
		try 
		{
			int res=a/b;//risky code
			System.out.println(res);
		}
		catch (Exception e) 
		{
			System.out.println("Sorry");
		}
		System.out.println("Main Ends");
	}
}
