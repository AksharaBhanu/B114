package day43;

public class Demo2 {
//abnormal termination
	public static void main(String[] args) {
		System.out.println("Main Start");
		m1();
		System.out.println("Main Ends");
	}
	public static void m1()
	{
		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");
	}
	
	public static void m2()
	{
		System.out.println("m2 start");
		System.out.println(10/0);
		System.out.println("m2 end");
	}
}
