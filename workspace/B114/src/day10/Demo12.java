package day10;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=10;i++)
		{
			int res=n*i;
			System.out.println(n+"x"+i+"="+res);
		}
	}
}
