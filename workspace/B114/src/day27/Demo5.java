package day27;
class E
{
	public void m1()
	{
		System.out.println("m1 of E");
	}
}
public class Demo5 {
	public void m2()
	{
		System.out.println("m2 of Demo5");
	}
	public static void main(String[] args) {
		E e1=new E();
		e1.m1();

		Demo5 d5=new Demo5();
		d5.m2();
	}

}
