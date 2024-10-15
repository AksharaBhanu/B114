package day12;

import java.util.Scanner;

public class Demo13 {
//find the sum of the digits present in the given number
	public static void main(String[] args) {
		int number,lastDigit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number:");
		number=sc.nextInt();
		sc.close();
		
		
		while(number>0)
		{
			lastDigit=number%10;
			sum=sum+lastDigit;
			number=number/10;
		}
		
		System.out.println(sum);
	
	}

}
