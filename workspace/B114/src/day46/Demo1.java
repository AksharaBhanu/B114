package day46;

public class Demo1 {

	public static void printStringAddress(String s)
	{
		int addr = System.identityHashCode(s);
		System.out.println(addr);
	}
	
	public static void main(String[] args) {
	
		String s1="abc";
		String s2="abc";
		printStringAddress(s1);
		printStringAddress(s2);
		s1="xyz";
		printStringAddress(s1);
		
		s1="abc";
		printStringAddress(s1);
		
		String s5="abc";
		printStringAddress(s5);

	}

}
