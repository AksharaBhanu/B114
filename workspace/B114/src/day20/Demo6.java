package day20;

import java.util.Scanner;

/*create method which will check whether give number is prime number or not
 * 
 * 
 */
public class Demo6 {

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
		System.out.println("Please enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(isPrime(n))
		{
			System.out.println("it is Prime Number");
		}
		else
		{
			System.out.println("it is Not a Prime Number");
		}

	}

}
