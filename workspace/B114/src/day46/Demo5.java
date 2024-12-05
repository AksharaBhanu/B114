package day46;

public class Demo5 {

	public static void main(String[] args) {
		String s1="abc";
		String s2 = s1.replace("a","@");
		System.out.println(s1);//abc
		System.out.println(s2);//@bc
		
		StringBuffer sb1=new StringBuffer("abc");
		sb1.replace(0,1, "@");
		System.out.println(sb1);

	}

}
