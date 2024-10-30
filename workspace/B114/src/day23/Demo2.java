package day23;
class B
{
	int i=10;
	B()
	{
		int j=20;
		System.out.println(i);//10
		System.out.println(j);//20
	}
}

class C
{
	int i=10;//global variable
	C()
	{
		int i=20;//local variable
		System.out.println(i);//20
	}
}
public class Demo2 {

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.i);
//		System.out.println(b1.j);
		
		C c1=new C();
		System.out.println(c1.i);//global variable---> use address of the object
		
	}

}
