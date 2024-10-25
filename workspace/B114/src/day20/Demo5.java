package day20;
/*print factorial for each number till 10
 * 
 * 1-->1
 * 2--->2
 * 3--->6
 * 4--->24
 * 
 * 
 */
public class Demo5 
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
		for(int i=1;i<=10;i++)
		{
			int f=findFactorial(i);
			String msg="Factorial of "+i+" is: "+f;
			System.out.println(msg);
		}
	}

}
