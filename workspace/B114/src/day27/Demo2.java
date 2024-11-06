package day27;

import java.util.Scanner;

//we want to initialize 'i' by taking value from user
//i value should not be allowed to change later
class B
{
	final static int i;
	static int j;
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		i=sc.nextInt();
		sc.close();
		System.out.println(j);
	}
}
public class Demo2 {

	public static void main(String[] args) 
	{	
		System.out.println(B.i);
		System.out.println(B.i);
		System.out.println(B.i);
//		B.i=20;
		
	}

}
