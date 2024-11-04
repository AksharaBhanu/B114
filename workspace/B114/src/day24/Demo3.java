package day24;

import java.util.Scanner;

public class Demo3 {
//check if the given number is even or odd
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int n=sc.nextInt();
		sc.close();
		
		if(n%2==0)
		{
			System.out.println("It is a even number");
		}
		else
		{
			System.out.println("It is a odd number");
		}

	}

}
