package day44;

public class Demo8 {
	public static String s=null;
	public static void main(String[] args) {
		System.out.println("main starts");
		int n=0;
		try 
		{
			System.out.println(s.length());//risky code
		}
		catch (Exception e) 
		{
			System.out.println(10/n);//recovery code
		}
		finally 
		{
			System.out.println("I am finally");//clean up code
		}
		System.out.println("main ends");
	}

}
