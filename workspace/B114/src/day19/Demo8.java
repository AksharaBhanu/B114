package day19;

public class Demo8 {

	public static void main(String[] args)
	{
		
		Demo8.isPositiveNumber(10);
		Demo8.isPositiveNumber(-10);
	}

	public static void isPositiveNumber(int n)
	{
		if(n>0)
		{
			System.out.println("It is Positive Number");
		}
		else
		{
			System.out.println("IT is not Positive Number");
		}
	}
}
