package day09;

import java.util.Scanner;

public class Demo5 {
//ask the user to press a number and print the language 
/*
 * 1. English
 * 2. Hindi
 * 3. kannada
 * 4. invalid input
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz select the language:\n1.English \n2.Hindi \n3.kannada ");
		int number=sc.nextInt();
		sc.close();
		
		switch(number)
		{
			default:
					System.out.println("Invalid input");
					break;
			
			case 3:
					System.out.println("You have Selected Kannada");
					break;
				
			case 1:
					System.out.println("You have Selected English");
					break;
			
			case 2:
					System.out.println("You have Selected Hindi");
					
					
		}
		System.out.println("Thank You");
	}

}