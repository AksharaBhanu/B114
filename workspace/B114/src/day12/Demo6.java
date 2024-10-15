package day12;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		int status=1; //1- execute 0-stop
		
		Scanner sc=new Scanner(System.in);
		
		for(;status==1;) 
		{
			System.out.println("Plz enter a number");
			int n=sc.nextInt();
			n=n*2;
			System.out.println(n);
			
			System.out.println("Do you want to continue(1) or stop(0)?");
			status=sc.nextInt();
		}
		sc.close();
		System.out.println("Thank You");
	}

}
