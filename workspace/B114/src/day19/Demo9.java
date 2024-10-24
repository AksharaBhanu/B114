package day19;

public class Demo9 {

	public static void main(String[] args)
	{
		
		String msg = isPositiveNumber(10);
		System.out.println(msg);
		
		System.out.println(isPositiveNumber(-10));
	}

	public static String isPositiveNumber(int n)
	{
		String msg="";
		if(n>0)
		{
			msg="It is Positive Number";
		}
		else
		{
			msg="IT is not Positive Number";
		}
		
		return msg;
	}
}
