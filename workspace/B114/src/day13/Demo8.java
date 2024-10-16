package day13;

import java.util.Scanner;

public class Demo8 {
/*Accept 5 numbers from user, store them in array and print them in reverse order
 * 
 * 
 */
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the array size");
		int size=sc.nextInt();
		int[] a= new int[size];
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Plz enter the number");
			int n=sc.nextInt();
			a[i]=n;
		}
		sc.close();

		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
