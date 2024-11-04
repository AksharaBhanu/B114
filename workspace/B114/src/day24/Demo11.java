package day24;

public class Demo11 {
//print the common elements present in the 2 arrays
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		
		int[] b= {2,60,10,40,30};
		
		for(int n:a)
		{
			for(int t:b)
			{
				if(n==t)
				{
					System.out.println(n);
				}
			}
		}
		
		
	}

}
