package day20;
/*create a method which returns factorial of a given number
 * 
 * ex: if input is 3, it should return 1*2*3
 * 
 */
public class Demo4 
{

	public static int findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		
		return fact;
	}
	
	public static void main(String[] args)
	{
		System.out.println(findFactorial(3));
	}

}
