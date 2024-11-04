package day24;

import java.util.Scanner;

public class Demo4 {
///check if given number is +ve or not
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int n=sc.nextInt();
		sc.close();
		
		if(n>0)
		{
			System.out.println("It is a +ve number");
		}
		else if(n<0)
		{
			System.out.println("It is a -ve number");
		}
		else
		{
			System.out.println("It is a ZERO");
		}

	}

}
