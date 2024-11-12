package day31;

class A
{
	private int i;
	
	A(int i)
	{
		this.i=i;
	}
	
	int getValue()
	{
		return i;
	}
}

class B
{
	int i;
	
	B(int i)
	{
		this.i=i;
	}
	
	int getValue()
	{
		return i;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
		A a1=new A(10);
		System.out.println(a1.getValue());
		
		B b1=new B(10);
		System.out.println(b1.getValue());
		
		b1.i=20;
		System.out.println(b1.getValue());
		
	}

}
