package day20;

public class Demo1 {

	public static int m1(int i)
	{	
		return i*2;
	}
	
	public static void main(String[] args) 
	{

		int res = Demo1.m1(10);//while calling the method signature should match
		System.out.println(res);
	}
	
}
