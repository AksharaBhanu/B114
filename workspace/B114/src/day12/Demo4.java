package day12;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Plz enter a number");
			int n=sc.nextInt();
			n=n*2;
			System.out.println(n);
		}
		sc.close();
		System.out.println("Thank You");
	}

}
