package day27;
class D
{
	public static void m1()
	{
		System.out.println("m1 of D");
	}
}
public class Demo4 {

	public static void m2()
	{
		System.out.println("m2 of D");
	}
	public static void main(String[] args) {

		D.m1();
		Demo4.m2();
		m2();

	}

}
