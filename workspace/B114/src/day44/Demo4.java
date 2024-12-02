package day44;

public class Demo4 {
	public static String s;
	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");
	}

	public static void m1() 
	{
		System.out.println("M1 Starts");
		System.out.println(s.length());//NullPointerException
		System.out.println("M1 Ends");
	}
}
