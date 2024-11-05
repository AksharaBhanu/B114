package day26;
class D{
	static int i=10;
	
	{
		System.out.println("Non-static block1");
	}
	
	D()
	{
		System.out.println("constructor");
	}
	
	{
		System.out.println("Non-static block2");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println(D.i);
		D d1=new D();
		D d2=new D();
		System.out.println("Main Ends");

	}

}
