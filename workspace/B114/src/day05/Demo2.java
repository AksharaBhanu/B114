package day05;

public class Demo2 {
//byte short int long
//float double
//boolean char
	public static void main(String[] args) {
		byte a=127;
		System.out.println(a);//20
		
		short b=(short)a;
		System.out.println(b);//20
		
		short c=a;//auto widening 
		System.out.println(c);
		
		//narrowing
		byte d=(byte)c;
		System.out.println(d);
		
//		byte e=c;
		

	}

}