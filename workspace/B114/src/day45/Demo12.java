package day45;

public class Demo12 {
//print the given string in reverse
	public static void main(String[] args) {
		String s="IBM";//MBI
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
