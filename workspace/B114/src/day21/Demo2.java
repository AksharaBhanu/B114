package day21;

public class Demo2 {
	public static void m1(String s1,String... fruits)
	{
		System.out.println("Start");
		
		System.out.println(s1);
		
		System.out.println(fruits.length);
		
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println("End");
	}
	
//	public static void m2(String... fruits1,String... fruits2)
//	{
//		
//		System.out.println("m2");
//	}
	public static void main(String[] args) {


//		Demo2.m1();
		
		Demo2.m1("Apple");
		
		
		Demo2.m1("Apple","Mango","Banana","Chiku","Orange");

	}

}
