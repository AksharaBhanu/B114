package day46;

public class Demo6 {
//reverse the given String
	public static void main(String[] args) {
		String s1="mom";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}

		System.out.println(s2);
		
		StringBuffer b1=new StringBuffer("mom");
		b1.reverse();
		System.out.println(b1);
	}

}
