package day35;
abstract class A13
{
	abstract void m1();
	
	abstract void m2();
	
	public static void m3()
	{
		System.out.println("m3");
	}
}

abstract class A14
{
	void m1(){System.out.println("m1");}
	
	void m2(){System.out.println("m2");}
	
	public static void m3()
	{
		System.out.println("m3");
	}
}
abstract class A15
{
	abstract void m1();
	
	void m2(){System.out.println("m2");}
	
	public static void m3()
	{
		System.out.println("m3");
	}
}
public class Demo7 {

	public static void main(String[] args) {
		
		A13.m3();
		A14.m3();
		A15.m3();

	}

}
