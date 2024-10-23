package day18;

public class Demo3 {
	
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Demo3.m1();//calling m1 method present in Demo3 class
		Demo3.m1();
		m1();
		System.out.println("Main Ends");
	}
	public static void m1()
	{
		System.out.println("This is m1 method");
	}
	
}
