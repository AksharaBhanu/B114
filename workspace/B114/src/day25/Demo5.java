package day25;
class C
{
	int i=10;//non-static variable-stored inside object--multiple copy--> access it using ref
	static int j=20;//static variable-strored in static pool -single copy-access using class name
	
}
public class Demo5 {

	public static void main(String[] args) {
		
		
		
		C c1=new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		
		System.out.println(C.j);
	}

}
