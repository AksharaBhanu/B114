package day19;

public class Demo4 {

	public static void main(String[] args) 
	{
	
		int n=5;//local variable of main method
		Demo4.m1(n);//n is called as parameter-can be a variable
		
		Demo4.m1(10);//parameter can be value also-can be a value
		

	}

	public static void m1(int a) //a is called as argument-always a variable
	{
		System.out.println(a*10);
	}
}
