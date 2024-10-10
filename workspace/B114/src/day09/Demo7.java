package day09;

import java.util.Scanner;

public class Demo7 {
//accept the month and print the Quarter to which it belongs to
//	1 2 3--> Q1  4 5 6--> Q2  7 8 9 Q3 10 11 12 Q4
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the month(1-12)");
		int month=sc.nextInt();
		sc.close();
		
		if(month==1||month==2||month==3)
		{
			System.out.println("Q1");
		}
		else if(month==4||month==5||month==6)
		{
			System.out.println("Q2");
		}
		else if(month==7||month==8||month==9)
		{
			System.out.println("Q3");
		}
		else if(month==10||month==11||month==12)
		{
			System.out.println("Q4");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
