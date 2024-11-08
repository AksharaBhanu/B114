package day28;
class F
{
	F()
	{
		System.out.println("F C");
	}
	
}
class G extends F
{
	G()
	{
		super();
		System.out.println("G C");
	}
}
public class Demo7 {

	public static void main(String[] args) {
		
//		F f1=new F();
		
		G g1=new G();
	}

}
