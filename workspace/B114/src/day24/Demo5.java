package day24;

import java.util.Scanner;

public class Demo5 {
//check if the person is eligible for voting
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter your age");
		int age=sc.nextInt();
		sc.close();
		
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You can't vote");
		}

	}

}
