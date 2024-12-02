package day44;

public class Demo3 {
//ArithmeticException	--unchecked exception--it is not mandatory to write throws or try-catch
	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");
	}

	public static void m1() 
	{
		System.out.println("M1 Starts");
		System.out.println(10/0);
		System.out.println("M1 Ends");
	}
}
