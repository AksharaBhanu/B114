package day08;

import java.util.Scanner;

public class Demo1 {
//accept a number from user and print its double
	public static void main(String[] args) {
		System.out.println("Hi Plz enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int d=n*2;
		System.out.println(d);

	}

}