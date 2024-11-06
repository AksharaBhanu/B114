package day27;

import java.util.Scanner;

class A
{
	final static int i=10;
	
	final static int j;
	
	static 
	{
		System.out.println("read from xl");
		j=20;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(A.i);
		System.out.println(A.j);
	}

}
