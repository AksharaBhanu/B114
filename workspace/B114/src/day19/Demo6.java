package day19;

public class Demo6 {

	public static void main(String[] args) {
		
		int res = Demo6.addNumber(10,20);
		System.out.println("The sum is:"+res);
		
		Demo6.addNumber(1,2);
		
		res=Demo6.addNumber2(5, 10);
		System.out.println(res);
		
	}

	public static int addNumber(int a,int b)
	{
		int sum=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum);
		return sum;
	}
	
	public static int addNumber2(int a,int b)
	{
		return a+b;
	}
}
