package day31;
class C
{
	static void m1()
	{
		System.out.println("Hi");
	}
}
//we can overload the method in child class
class D extends C
{
	static void m1(int i)
	{
		System.out.println(i);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		D.m1();
		D.m1(10);//calling the method
	}

}
