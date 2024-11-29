package day43;

public class Demo8 {
//grace full termination
	public static void main(String[] args) {
		System.out.println("Main Start");
		int a=10,b=0;
		try 
		{
			int res=a/b;//risky code
			System.out.println(res);
		}
		catch (Exception e) 
		{
			System.out.println("Sorry");//recovery code
		}
		System.out.println("Main Ends");
	}
}
