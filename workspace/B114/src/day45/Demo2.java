package day45;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a name");
		String n1=sc.next();
		System.out.println("Plz enter another name");
		String n2=sc.next();
		sc.close();
		
//		if(n1==n2)
//		{
//			System.out.println("Same");
//		}
//		else
//		{
//			System.out.println("Diff");
//		}
		
//		if(n1.equals(n2))
//		{
//			System.out.println("Same");
//		}
//		else
//		{
//				System.out.println("Diff");
//		}
		
		if(n1.equalsIgnoreCase(n2))
		{
			System.out.println("Same");
		}
		else
		{
				System.out.println("Diff");
		}
	}

}
