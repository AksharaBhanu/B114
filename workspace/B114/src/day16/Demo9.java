package day16;

public class Demo9 {
//
	public static void main(String[] args) {
		int[] a= {1,1,5,1};
		int given=7;
		int count=0;
		
		for(int n:a)
		{
			if(n==given)
			{
				count++;
			}	
		}
		
		System.out.println(count);
		

	}

}
