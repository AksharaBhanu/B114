package day20;

import java.util.Scanner;

public class Demo9 {

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
		//print prime numbers upto n
		//print prime numbers upto 5
		for(int i=1;i<=10;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);//print prime numbers b/w 1 to 5--> 2 3 5 7 
			}
		}
		System.out.println("-----------------");
		
		
		//print n prime numbers
		//print 5 prime numbers
		int i=1;
		int count=0;
		while(count<10) //print 1st 5 prime numbers
		{
			if(isPrime(i))
			{
				System.out.println(i);//2 3 5 7 11 13 17 19 23 29
				count++;
			}
			i++;
		}

	}

}
