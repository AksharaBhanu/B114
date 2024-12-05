package day46;

public class Demo4 {
	public static void printAddress(StringBuilder s)
	{
		int addr = System.identityHashCode(s);
		System.out.println(addr);
	}
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("bhanu");
		System.out.println(s);
		printAddress(s);
		
		s.append("prakash");
		System.out.println(s);
		printAddress(s);
		
	}

}
