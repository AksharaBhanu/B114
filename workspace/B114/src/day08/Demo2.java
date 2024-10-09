package day08;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		System.out.println("Plz enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		
		if(a>50)
		{
			System.out.println("Hi");
		}
		else
		{
			System.out.println("Bye");
		}
		
		System.out.println("Main Ends");
	}

}
