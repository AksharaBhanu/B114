package day05;

public class Demo5 {

	public static void main(String[] args) {
		short a=200;
		byte b=(byte)a;
		
		System.out.println(a);//200
		System.out.println(b);//-56
		//home work: find out y it is -56
		
		short x=100;
		byte y=(byte)x;
		
		System.out.println(x);//100
		System.out.println(y);//100
		
		//it will copy bits from right to left
		//any excess bits are ignored
		

	}

}