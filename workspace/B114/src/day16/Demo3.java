package day16;

public class Demo3 {
//write a code to find the smallest array elements?
	public static void main(String[] args) {
		int[] a= {2,6,1,7};
		int small = a[0];
		for(int n:a)
		{
			if(small>n)
			{
				small=n;
			}
		}
		
		System.out.println(small);
	}

}
