package day32;
class MyString
{
	String s;
	
	MyString(String s)
	{
		this.s=s;
	}
	public String toString()
	{
		return s;
	}
}
public class Demo3 {

	public static void main(String[] args) {

		MyString m1=new MyString("Bhanu");
		System.out.println(m1.toString());//day32.MyString@m123
		
		String m2=new String("Bhanu");
		System.out.println(m2);//java.lang.String@s123
		System.out.println(m2.toString());
		

	}

}
