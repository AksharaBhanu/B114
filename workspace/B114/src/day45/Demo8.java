package day45;

public class Demo8 {

	public static void main(String[] args) {

		String str="Bhanu";
		int count=str.length();
		System.out.println(count);
		
		System.out.println(str.charAt(0));
		System.out.println("----");
		for(int i=0;i<count;i++)
		{
			System.out.println(str.charAt(i));
		}

		System.out.println(str.substring(2,5));
		
		
	}

}
