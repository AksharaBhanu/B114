package day20;

public class Demo2 {

	public static int m1(int i,int j)
	{	
		int sum=i+j;
		return sum;
	}
	
	public static int m2(int[] a)
	{	
		int sum=0;
		for(int v:a)
		{
			sum=sum+v;
		}

		return sum;
	}
	public static void main(String[] args) 
	{
		int res1 = m1(10,20);
		System.out.println(res1);
		
		int[] a= {10,20,30,40};
		int res2=m2(a);
		System.out.println(res2);
	}
	
}
