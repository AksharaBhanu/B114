package day21;

public class Demo3 {
	public static void m1(int a,String s,boolean... b)
	{
		System.out.println(a);
		System.out.println(s);
		System.out.println(b.length);
		for(boolean p:b)
		{
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		
		Demo3.m1(10,"Bhanu");
		Demo3.m1(10,"Bhanu",true);
		Demo3.m1(10,"Bhanu",true,false);
	}

}
