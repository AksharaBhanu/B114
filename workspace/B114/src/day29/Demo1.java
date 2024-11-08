package day29;
class A
{
	int i=10;
	A()
	{
		System.out.println("A class constructor");
	}
}

class B extends A
{
	int i=20;
	B()
	{	
		super();//call parent class constructor
		System.out.println("B class constructor");
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		B b1=new B();
	}
}
