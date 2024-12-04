package day45;

public class Demo11 {
//print the given String vertically
	public static void main(String[] args) {
		String s="TCS";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("-----");
		for(String a:s.split(""))
		{
			System.out.println(a);
		}
	}

}
