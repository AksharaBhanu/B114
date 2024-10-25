package day20;
/*create a method which returns sum of n natural numbers
 * 
 * ex: if input is 4, it should return 1+2+3+4
 * 
 */
public class Demo3 
{

	public static int findSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(findSum(5));//output of inner method will be input for outer method
		//output of findSum which 15 , will be input for outer method println
		
		System.out.println(findSum(6));
	}

}
