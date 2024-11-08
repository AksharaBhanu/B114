package day28;
class A
{
	 static String s1="ABC";
}
public class Demo2 {

	public static void main(String[] args) {
		String s2 = A.s1;
		int l = s2.length();
		System.out.println(l);
	}

}
