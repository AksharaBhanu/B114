package day31;
class E
{
	@Override //annotation
	public String toString()
	{
		return "Hi Bhanu";
	}
	
	//for this method we cant add @Override
	public void m1()
	{
		
	}
}
public class Demo7 {

	public static void main(String[] args) {
	
		E e1=new E();
		String s = e1.toString();
		System.out.println(s);
	}

}
