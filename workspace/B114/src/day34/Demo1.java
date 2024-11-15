package day34;
interface A
{
	 int i=10;
	 
	public abstract void m1();
	 
}

class B implements A
{
	public void m1()
	{
		System.out.println("hi");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		System.out.println(A.i);
		
		B b1=new B();
		b1.m1();
		
		//converting child class object to parent type
		A a1=new B();
		a1.m1();
		
	}

}
