package day12;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		int status;
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Plz enter a number");
			int n=sc.nextInt();
			n=n*2;
			System.out.println(n);
			
			System.out.println("Do you want to continue(1) or stop(0)?");
			status=sc.nextInt();
		}while(status==1);
			
		sc.close();
		System.out.println("Thank You");
	}

}
