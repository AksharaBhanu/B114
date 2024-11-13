package day32;
class Parent
{
	public void parentOnly()
	{
		System.out.println("parentOnly");
	}
	
	public void both()
	{
		System.out.println("both from Parent");
	}
}

class Child extends Parent
{
	public void both()
	{
		System.out.println("both from child");
	}
	
	public void childOnly()
	{
		System.out.println("childOnly");
	}
}
public class Demo9 {

	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.parentOnly();//parentOnly
		p1.both();//both from Parent
		System.out.println("-------");
		
		Child c1=new Child();
		c1.parentOnly();//parentOnly
		c1.both();//both from child
		c1.childOnly();//childOnly
		System.out.println("-------");
		
		//upcasting
		p1=c1;
		p1.parentOnly();//parentOnly
		p1.both();//both from child
		System.out.println("-------");
		
		Parent p2=new Child();
		p2.parentOnly();
		p2.both();
	}

}
