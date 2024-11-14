package day33;
class A2
{
	void m2()
	{
		System.out.println("M2 of A2");
	}
}

class B2 extends A2
{
	void m2()
	{
		System.out.println("M2 of B2");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		B2 b2=new B2();
		b2.m2();
		
		A2 a2=b2;
		a2.m2();
		
	}

}
