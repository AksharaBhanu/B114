package day19;

public class Demo7 {

	public static void main(String[] args) {
		
		Demo7.m1(10,20);
		
		int[] r = Demo7.m2(10,20);
		System.out.println(r[0]);
		System.out.println(r[1]);
	}

	public static void m1(int a,int b)
	{
		int sum=a+b;
		int pro=a*b;
		System.out.println(sum);
		System.out.println(pro);
	}
	
	public static int[] m2(int a,int b)
	{
		int sum=a+b;
		int pro=a*b;
		int[] result= {sum,pro};
		return result;
	}
}
