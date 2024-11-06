package day27;
class G
{
	int i=10;
	static int j=20;
	
	public static void m1()//static method
	{
		System.out.println(j);//inside static method we can access static var
//		System.out.println(i);//inside static method we can't access non-static var
//		System.out.println(this);//inside static method we can't access this
	}
	
	public void m2()//non-static method
	{	
		System.out.println(j);//inside non-static method we can access static var
		System.out.println(i);//inside non-static method we can access non-static var
		System.out.println(this);//inside non-static method we can access this
	}
}
public class Demo7 {

	public static void main(String[] args) {
		
		G.m1();
		G g1=new G();
		g1.m2();
	}

}
