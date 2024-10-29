package day22;
class A
{
	int i;
}
public class Demo3 {

	public static void main(String[] args) {
		A a1=new A();
		a1.i=10;
		
		A a2=new A();
		a2.i=20;
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.i);
		System.out.println(a2.i);

	}

}
