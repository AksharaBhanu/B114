package day33;
interface C
{
	public abstract void m1();
	void m2();
}

class D implements C
{
	public void m1()
	{
		System.out.println("M1 of D");
	}
	
	public void m2()
	{
		System.out.println("M2 of D");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		C c1=new D();//auto upcasting
		c1.m1();
		c1.m2();

	}

}
