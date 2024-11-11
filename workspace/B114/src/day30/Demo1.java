package day30;

import java.util.Scanner;

//i dont want any one to inherit my class 
//i dont want any to create object of my class (my class contains only static member)
class A
{
	static int i=10;
	private A()
	{
		
	}
	
}

//i dont want any one to inherit my class 
//i want them to create object of my class(my class contains non- static member)
final class B
{
	 int i=20;
}


public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(A.i);
		B b1=new B();
		System.out.println(b1.i);
	}

}
