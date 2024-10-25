package day20;

import java.util.Scanner;

/*create method which will check whether give number is prime number or not
 * 
 * 
 */
public class Demo8 {

	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(isPrime(i)?i+" is a Prime Number":i+" is Not a Prime Number");
		}
	}

}
