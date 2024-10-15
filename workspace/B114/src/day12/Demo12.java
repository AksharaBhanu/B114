package day12;

import java.util.Scanner;

public class Demo12 {
//count the number of digits present in given number
	public static void main(String[] args) {
		int number,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		number=sc.nextInt();
		sc.close();
		
		while(number>0)
		{
			number=number/10;
			count++;
		}
		
		System.out.println(count);
	
	}

}
