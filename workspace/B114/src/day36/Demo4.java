package day36;
class A
{
	int v;
	
	A(int v)
	{
		this.v=v;
	}
	
	int getValue()
	{
		return v;
	}
}

class B
{
	boolean v;
	
	B(boolean v)
	{
		this.v=v;
	}
	
	boolean getValue()
	{
		return v;
	}
}

class C
{
	String v;
	
	C(String v)
	{
		this.v=v;
	}
	
	String getValue()
	{
		return v;
	}
}
public class Demo4 {

	public static void main(String[] args) {
		A a1=new A(10);
		System.out.println(a1.getValue());
		
		B b1=new B(true);
		System.out.println(b1.getValue());
		
		C c1=new C("Bhanu");
		System.out.println(c1.getValue());
		
		

	}

}
