package day21;

public class Demo1 {

	public static void m1(int i,int j)
	{
		System.out.println(i+j);
	}
	
	public static void m2(int[] a)
	{
		System.out.println(a);// [I@ab123
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
	public static void m3(int... a)//var arg of type int
	{
		System.out.println(a);
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		Demo1.m1(10,20);

		int[] b= {10,20,30};
		Demo1.m2(b);
		System.out.println("---");
		Demo1.m3();
		Demo1.m3(10);
		Demo1.m3(10,20,30);
		Demo1.m3(10,20,30,40,50,60,70);
	}

}
