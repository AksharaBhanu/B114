package day27;
class H
{
	public void m1()
	{
		System.out.println("3"+this);
	}
	
	{
		System.out.println("1"+this);
	}
	
	H()
	{
		System.out.println("2"+this);
	}
	
	static
	{
//		System.out.println("1"+this);
	}
	
	public static void m2()
	{
//		System.out.println("1"+this);//Cannot use this in a static context
	}
	
}
public class Demo8 {

	public static void main(String[] args) {
		
		H h1=new H();
		h1.m1();
		

	}

}
