package day13;

import java.util.Scanner;

public class Demo7 {
/*Accept 5 numbers from user, store them in array and print them in reverse order
 * 
 * 
 */
	public static void main(String[] args) {
		
		int[] a= new int[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
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
