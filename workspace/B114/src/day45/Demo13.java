package day45;

public class Demo13 {
//print only the digits present in the given String
	public static void main(String[] args) {
		String msg="Page 12 of 53 in Java";

		for(int i=0;i<msg.length();i++)
		{
			char c = msg.charAt(i);
			if(c>='0' && c<='9')
			{
				System.out.println(c);
			}
		}
		System.out.println("------");
		for(int i=0;i<msg.length();i++)
		{
			char c = msg.charAt(i);
			if(c>='A' && c<='Z')
			{
				System.out.println(c);
			}
		}
		
	}

}
