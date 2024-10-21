package day16;

public class Demo7 {
//check whether given number is present in the array or not,
//	if it is present print its position
	public static void main(String[] args) {
		int[] a= {2,6,1,7,1};
		int given=1;
		String msg="Not Found";
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==given)
			{
				msg="Found at index "+i;
				break;
			}
			
		}
		
		System.out.println(msg);

	}

}
