package day28;
class B
{
	void test()
	{
		System.out.println("test");
	}
}

class C
{
	final static B b1=new B();
}
public class Demo3 {

	public static void main(String[] args) {
//		C.b1=null;
		
//		B b2=C.b1;
//		b2.test();
		 
		C.b1.test(); 

	}

}
