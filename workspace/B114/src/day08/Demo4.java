package day08;

import java.util.Scanner;

public class Demo4 {
//write a java code to check whether the give number is odd or even
//	1 3 5 7 9
//	2 4 6 8 10
	public static void main(String[] args) {
	
		System.out.println("Plz enter a number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		
		if(number%2==0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}

}
