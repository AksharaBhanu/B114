package day24;

import java.util.Scanner;

public class Demo7 {
//compare 2 var
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int a=sc.nextInt();
		System.out.println("Plz enter another number");
		int b=sc.nextInt();
		sc.close();
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else if (b>a)
		{
			System.out.println(b+" is greater than "+a);
		}
		else
		{
			System.out.println(a+" is equal to "+b);
		}

	}

}
