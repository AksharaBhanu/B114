package day28;
class Parent
{
	static int i=10;
}

class Child extends Parent
{
	
}
public class Demo5 {

	public static void main(String[] args) {
		Parent.i=123;
		System.out.println(Parent.i);
		System.out.println(Child.i);
	}

}
