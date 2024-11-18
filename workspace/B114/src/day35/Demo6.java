package day35;
interface A12
{
	void m1();
	void m2();
}

abstract class B12 implements A12
{
	
	public void m1()
	{
		System.out.println("Hi");
	}
}

class C12 extends B12
{
	public void m2()
	{
		System.out.println("Bye");
	}
}
public class Demo6 {

	public static void main(String[] args) {
		
		C12 c=new C12();
		c.m1();
		c.m2();
		

	}

}
