package day25;
class A
{
	int count=0;
	
	A()
	{
		count++;
		System.out.println(count);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		A a1=new A();//1
		
		A a2=new A();//1
	
		A a3=new A();//1
		
	}

}
