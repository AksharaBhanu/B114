package day31;
class Calc
{
	//10 functions
	//1.0
//	public static void add(int i,int j)
//	{
//		System.out.println(i+j);
//	}
//	
//	public static void add(int a,int b)
//	{
//		System.out.println(i+j);
//	}
	
	//2.0
	public static void add(float i,float j)
	{
		System.out.println(i+j);
	}
	//3.0
	public static void add(double i,double j)
	{
		System.out.println(i+j);
	}
	
	
}
public class Demo4 {

	public static void main(String[] args) {
		
		Calc.add(10,20);
		Calc.add(20.5f,10.6f);
		Calc.add(94817874930001111199999.5678, 948174565465464666666.5678);
		
		System.out.println(10);
		System.out.println("Bhanu");
		System.out.println(true);
		System.out.println();
		
	}

}
