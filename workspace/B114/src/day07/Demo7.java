package day07;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is ur name?");
		String name=sc.nextLine();
		
		System.out.println("What is ur age?");
		int age=sc.nextInt();
		
		sc.close();
		
		System.out.println("You are "+ name + " and ur age is:"+age);
		
		

	}

}
