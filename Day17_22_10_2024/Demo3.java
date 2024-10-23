package Day16;

import java.util.Scanner;

public class Demo3 {
	//write a code to find the smallest array elements?
		public static void main(String[] args) {
			/*int[] a= {21,6,11,7,4};
			int small = a[0];
			for(int n:a)
			{
				if(small>n)
				{
					small=n;
				}
			}
			
			System.out.println(small);*/
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int size = sc.nextInt();
			
			int[] a=new int[size];
			int small=a[0];
			
			for(int i=0;i<size;i++)
			{
				System.out.println("Please enter the array element at index "+i);
				a[i]=sc.nextInt();
			}
			sc.close();
			
			System.out.println("------------------");
			System.out.println("Array elements entered are:");
			for(int v:a) {
				System.out.println(v);
			}
			
			for(int i=0;i<a.length;i++)
			{
				if(small>a[i]) {
					small=a[i];
				}
			}
			
			System.out.println("smallest number is "+small);
		}

	}
