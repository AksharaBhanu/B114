package day26;
class A
{
	static final int a=0;
	final int b=0;
	static int c=0;
	int d=0;
	
	static final String e="Akshara";
	final String f="Akshara";
	static String g="Akshara";
	String h="Akshara";
	
}
public class Demo2 {
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(A.c);
		System.out.println(A.e);
		System.out.println(A.g);
		
		A a1=new A();
		System.out.println(a1.b);
		System.out.println(a1.d);
		System.out.println(a1.f);
		System.out.println(a1.h);
		//local variables
		final int i=10;
		int j=20;
		final String k="bhanu";
		String l="ravi";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
	}
}