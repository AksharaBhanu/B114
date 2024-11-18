package day35;
interface P
{
	public abstract void m1();
	
	
	// we can have concrete method in interface
	public default void m2()
	{
		System.out.println("public non-static Concreate method in interface");
		m4();
	}
	public static void m3()
	{
		System.out.println("public static Concreate method in interface");
		m5();
	}
	
	private void m4()
	{
		System.out.println("private non-static concrete method in interface");
	}
	
	private static void m5()
	{
		System.out.println("private static concrete method in interface");
	}
	
}

class Q implements P
{

	@Override
	public void m1() {
		System.out.println("m1 of Q");
		
	}
	
}
public class Demo9 {

	public static void main(String[] args) {
		Q q=new Q();
		q.m1();
		q.m2();
		
		P.m3();
		
	}

}
