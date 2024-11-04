package day24;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int a=sc.nextInt();
		System.out.println("Plz enter another number");
		int b=sc.nextInt();
		System.out.println("Plz enter one more number");
		int c=sc.nextInt();
		sc.close();

		if(a>b && a>c)
		{
			System.out.println("a is the greatest");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is the greatest");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is the greatest");
		}
		else if (a==b && a==c)
		{
			System.out.println("all 3 are equal");
		}
		else if (a==b && a>c)
		{
			System.out.println("a and b are same and greatest");
		}
		else if (a==c && a>b)
		{
			System.out.println("a and c are same and greatest");
		}
		else if (b==c && b>a)
		{
			System.out.println("b and c are same and greatest");
		}
	}

}
