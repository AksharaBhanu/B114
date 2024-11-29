package day43;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		System.out.println(10/0);
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int n=sc.nextInt();//InputMismatchException
		System.out.println("thank you");
		sc.close();
		System.out.println(n);
		System.out.println("End");
		
		
		
	}

}
