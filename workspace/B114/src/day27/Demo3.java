package day27;
class C
{
	static int s=100;
	
	final int i=10;
	final int j;
	final int k;
	
	{
		k=30;
		System.out.println(s);
	}
	
	C()
	{
		j=20;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		C c1=new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		

	}

}
