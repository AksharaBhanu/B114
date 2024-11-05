package day26;

public class Demo6 {
	static int i=10;
	int j=20;
	static
	{
		System.out.println("Static block");
	}

	{
		System.out.println("Non-static block");
	}
	Demo6()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		System.out.println(Demo6.i);
		Demo6 d6=new Demo6();
		System.out.println(d6.j);
		System.out.println("Main Ends");
	}
}
