package day09;

import java.util.Scanner;

public class Demo6 {
//accept the month and print the Quarter to which it belongs to
//	1 2 3--> Q1  4 5 6--> Q2  7 8 9 Q3 10 11 12 Q4
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the month(1-12)");
		int month=sc.nextInt();
		sc.close();
		
		if(month==1)
		{
			System.out.println("Q1");
		}
		else if(month==2)
		{
			System.out.println("Q1");
		}
		else if(month==3)
		{
			System.out.println("Q1");
		}
		else if(month==4)
		{
			System.out.println("Q2");
		}
		else if(month==5)
		{
			System.out.println("Q2");
		}
		else if(month==6)
		{
			System.out.println("Q2");
		}
		else if(month==7)
		{
			System.out.println("Q3");
		}
		else if(month==8)
		{
			System.out.println("Q3");
		}
		else if(month==9)
		{
			System.out.println("Q3");
		}
		else if(month==10)
		{
			System.out.println("Q4");
		}
		else if(month==11)
		{
			System.out.println("Q4");
		}
		else if(month==12)
		{
			System.out.println("Q4");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
