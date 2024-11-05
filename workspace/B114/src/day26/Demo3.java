package day26;
class B
{
	int i=10;
	
	static 	//static block 
	{
		System.out.println("static block");
	}
	
	B()//constructor
	{
		System.out.println("constructor");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		B b1=new B();
		System.out.println(b1.i);
	}

}
