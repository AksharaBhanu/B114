package day26;
class C{
	static int i=10;
	
	static 	
	{
		System.out.println("static block1");
	}
	static 	
	{
		System.out.println("static block2");
	}
	static 	
	{
		System.out.println("static block3");
	}
}
public class Demo4 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println(C.i);//class C is loaded here
		System.out.println(C.i);//class will not load again
		C c1=new C();//class will not load again
		System.out.println("Main Ends");
		
	}
}