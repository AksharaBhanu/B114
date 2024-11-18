package day35;
abstract class A16
{
	
	//all types of variable
	protected int i=10;
	public static final int j=20;
	
	//all types of methods
	abstract void m1();
	void m2() {System.out.println("m2");}
	static void m3() {System.out.println("m2");	}
	
	//constructor
	A16()
	{
		System.out.println("constructor");
	}
	//SB
	static {
		System.out.println("SIB");
	}
	//NSB
	{
		System.out.println("IIB");
	}
}

class B16 extends A16
{
	void m1()
	{
		System.out.println("m1");
	}
}
public class Demo8 {

	public static void main(String[] args) {
    
		A16 a=new B16();
		
		B16 b16=new B16();
		
		System.out.println(b16.i);
		System.out.println(b16.j);
		
		b16.m1();
		b16.m2();
		b16.m3();
		
		System.out.println(A16.j);
		A16.m3();
		

	}

}
