package day24;

import java.util.Scanner;

public class Demo6 {
//check if the person is eligible for marriage
//Home work: update this code to handle invalid inputs	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter your age");
		int age=sc.nextInt();
		System.out.println("Plz enter gender:1 for Male and 2 for Female");
		int gender=sc.nextInt();
		sc.close();
		
		if(gender==1 && age>=21)
		{
			System.out.println("You can marry");
		}
		else if(gender==2 && age>=18)
		{
			System.out.println("You can marry");
		}
		else
		{
			System.out.println("Sorry You cant marray");
		}

	}

}
