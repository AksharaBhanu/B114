package day07;

import java.util.Scanner;

public class Demo6 {
//how to accept input from user --> using scanner class
	public static void main(String[] args) {
		
		//creating object(copy) of Scanner class
		Scanner scanner=new Scanner(System.in);
		
		//ask the question to the user
		System.out.println("What is ur name?");
		
		//accept the input
		String name=scanner.nextLine();
		
		//close the scanner
		scanner.close();
		
		System.out.println("Your name is:"+name);
		
		
	}

}
