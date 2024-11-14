package day33;
class A1
{
	void m1()
	{
		System.out.println("M1 of A1");
	}
}

class B1 extends A1
{
	
}
public class Demo1 {

	public static void main(String[] args) {

		B1 b1=new B1();
		b1.m1();
		
		A1 a1=b1;
		a1.m1();

	}

}
