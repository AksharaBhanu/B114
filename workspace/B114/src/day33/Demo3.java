package day33;
class A3
{
	
}

class B3 extends A3
{
	void m3()
	{
		System.out.println("M3 of B3");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		A3 a3;
		B3 b3;
		
		b3=new B3();
		b3.m3();
		
		a3=b3; //auto upcasting
//		a3.m3();
		B3 b4=(B3)a3;//down casting
		b4.m3();
		
	}

}
