package day12;

import java.util.Scanner;

public class Demo11 {
//reverse the given number
	public static void main(String[] args) {
		int number,lastDigit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number to reverse:");
		number=sc.nextInt();
		sc.close();
		System.out.println("Reverse is:");
		while(number>0)
		{
			lastDigit=number%10;
			System.out.print(lastDigit);
			number=number/10;
		}
		
	
	}

}
