package day24;

public class Demo10 {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b= {10,20,30,40};
		
		int s1=a.length;
		int s2=b.length;
		
		if(s1==s2)
		{
			String msg="Same";
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					msg="Not Same";
					break;
				}
			}
			
			System.out.println(msg);
		}
		else
		{
			System.out.println("Not same");
		}
	}

}
