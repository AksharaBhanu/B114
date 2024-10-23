package day18;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		String msg="It is a Prime number";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		sc.close();
		
		if(n<=0)
		{
			msg="Invalid input";
		}
		else if(n==1)
		{
			msg="It is NOT a Prime number";
		}
		else 
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					msg="It is NOT a Prime number";
					break;
				}
			}
		}
		System.out.println(msg);
	}

}
