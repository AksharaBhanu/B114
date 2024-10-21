package day16;

public class Demo2 {
//write a code to find the sum of the array elements?
	public static void main(String[] args) {
		int[] a= {2,4,6,1,7,8};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}
