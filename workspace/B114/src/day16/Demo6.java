package day16;

public class Demo6 {
//check whether given number is present in the array or not?
	public static void main(String[] args) {
		int[] a= {2,6,1,7};
		int given=6;
		String msg="Not Found";
		
		for(int n:a)
		{
			if(n==given)
			{
				msg="Found";
				break;
			}
			
		}
		
		System.out.println(msg);

	}

}
