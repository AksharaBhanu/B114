package day07;

import java.util.Scanner;

public class Demo8 {
//accept 2 numbers from the user and display its sum
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int num1=sc.nextInt();
		
		System.out.println("Please enter another number:");
		int num2=sc.nextInt();
		
		sc.close();
		
		int sum=num1+num2;
		
		System.out.println("Sum of "+ num1 + " and " + num2 + " is " + sum);
		
	}

}