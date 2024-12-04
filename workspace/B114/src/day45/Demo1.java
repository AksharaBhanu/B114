package day45;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int n1=sc.nextInt();
		System.out.println("Plz enter another number");
		int n2=sc.nextInt();
		sc.close();
		
		if(n1==n2)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Diff");
		}
	}

}
