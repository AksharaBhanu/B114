package day25;
class B
{
	static int count=0;
	
	B()
	{
		count++;
		System.out.println(count);
	}
}
public class Demo4 {

	public static void main(String[] args) {
		
		B b1=new B();//1
		
		B b2=new B();//2
		
	}

}
