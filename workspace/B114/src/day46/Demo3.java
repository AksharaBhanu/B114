package day46;

public class Demo3 {
	
	public static void printAddress(String s)
	{
		int addr = System.identityHashCode(s);
		System.out.println(addr);
	}
	
	public static void printAddress(StringBuffer s)
	{
		int addr = System.identityHashCode(s);
		System.out.println(addr);
	}
	public static void main(String[] args) {
		String s1="abc";
		StringBuffer s2=new StringBuffer("abc");
		
		System.out.println(s1);//abc
		System.out.println(s2);//abc
		printAddress(s1);//947
		printAddress(s2);//445
		
		s1=s1+"xyz";
		s2.append("xyz");
		
		System.out.println(s1);//abcxyz
		System.out.println(s2);//abcxyz
		
		printAddress(s1);//067
		printAddress(s2);//445
	}

}
