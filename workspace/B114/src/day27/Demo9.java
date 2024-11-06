package day27;
class Emp
{
	
}

class I
{
	static String s1=new String("ABC");
	static String s2="ABC";
	static Emp e1=new Emp();
}
public class Demo9 {

	public static void main(String[] args) {
		System.out.println(I.s1);//ABC
		System.out.println(I.s2);//ABC
		System.out.println(I.e1);//day27.Emp@e123
	}

}
