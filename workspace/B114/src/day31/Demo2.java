package day31;

public class Demo2 {
	public static void m1()//method body
	{
		System.out.println("Hi");
	}
	
	private int m1(int i)
	{
		System.out.println(i);
		return i;
	}
	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		d2.m1(0);
		d2.m1();//calling statement
		
	}

}
