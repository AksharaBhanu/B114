package day16;

public class Demo8 {
//check whether given number is present in the array or not,
//	if it is present print all its position
	public static void main(String[] args) {
		int[] a= {1,2,1};
		int given=3;
		boolean found=false;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==given)
			{
				found=true;
				System.out.println("Found at index "+i);
			}
			
		}
		
		if(found==false)
		{
			System.out.println("Not Found");
		}
		

	}

}
