package day08;

import java.util.Scanner;

public class Demo3 {
//write a java code to check if the person can cast the vote
	public static void main(String[] args) {
		//ask the age
		
		//check if age is >=18
		
		//yes --> print 'u can vote'
		
		//no--> print 'sorry u cant vote'
		
		System.out.println("Plz enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		sc.close();
		
		if(age>=18)
		{
			System.out.println("yes you can vote");
		}
		else
		{
			System.out.println("sorry you can't vote");
		}
		
		System.out.println("Thank You");

	}

}
