package day16;

public class Demo4 {
//write a code to find the biggest array elements?
	public static void main(String[] args) {
		int[] a= {2,6,1,7};
		int big = a[0];
		for(int n:a)
		{
			if(big<n)
			{
				big=n;
			}
		}
		
		System.out.println(big);
	}

}
