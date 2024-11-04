package day25;
class D{
	int i=10;
	static int j=20;
}
public class Demo6 {
	public static void main(String[] args) {	
		int x=D.j;
		System.out.println(x);
		
//		int y=D.i;//to access non-static variable creating object is mandatory
//		System.out.println(y);
	}
}
