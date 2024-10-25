package day20;

import java.util.Scanner;

/*create method which will check whether give number is prime number or not
 * 
 * 
 */
public class Demo7 {

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
		System.out.println(isPrime(n)?"it is Prime Number":"it is Not a Prime Number");

	}

}
