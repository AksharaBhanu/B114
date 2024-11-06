package day27;
class F
{
	static int i=10;
	static int j=20;
	
	int x=100;
	
	public static void m1()
	{
		System.out.println(F.i);
		System.out.println(j);
	}
	
	public void m2()
	{
		System.out.println(x);
	}
}
public class Demo6 {

	public static void main(String[] args) {
		F.m1();

		F f1=new F();
		f1.m2();
	}

}
