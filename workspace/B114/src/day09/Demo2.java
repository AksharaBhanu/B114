package day09;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the gender Female-1 Male-2");
		int gender =sc.nextInt();
		
		
		if(gender==1)
		{
			System.out.println("Please enter the age");
			int age=sc.nextInt();
			
			if(age>=18)
			{
				System.out.println("Yes madam you can marry");
			}
			else
			{
				System.out.println("No sorry u cant marry");
			}
		}
		else if(gender==2)
		{
			System.out.println("Please enter the age");
			int age=sc.nextInt();
			
			if(age>=21)
			{
				System.out.println("Yes Sir you can marry");
			}
			else
			{
				System.out.println("No, sorry u cant marry");
			}
		}
		else
		{
			System.out.println("invalid input");
		}
		
		sc.close();
	}

}