package day06;

public class Demo5 {

	public static void main(String[] args) {
		int a,b;
		
		a=10;
		a++;//post increment
		System.out.println(a);
		
		a=10;
		++a;//pre increment
		System.out.println(a);
		
		a=10;
		b=a++;
		System.out.println(a);
		System.out.println(b);
		
		a=10;
		b=++a;
		System.out.println(a);
		System.out.println(b);

	}

}