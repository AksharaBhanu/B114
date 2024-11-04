package day24;

public class Demo2 {
//swap 2 variables without using 3rd variable
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}

}
