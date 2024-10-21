package day16;

import java.util.Scanner;

public class Demo10 {
//
	public static void main(String[] args) {
		int[] a= {2,2,3,1,3,3};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int given=sc.nextInt();
		sc.close();
		
		int count=0;
		
		for(int n:a)
		{
			if(n==given)
			{
				count++;
			}	
		}
		
		if(count==0)
		{
			System.out.println("Not Found");
		}
		else if(count==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Duplicate");
		}

	}

}
