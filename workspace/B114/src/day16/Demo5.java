package day16;

public class Demo5 {
//write a code to print odd numbers present in array?
	public static void main(String[] args) {
		int[] a= {2,6,1,7,3,5,4,8,9};
		
		for(int n:a)
		{
			if(n%2!=0)
			{
				System.out.println(n);
			}
		}
	}

}
