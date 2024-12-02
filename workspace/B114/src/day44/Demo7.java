package day44;

public class Demo7 {

	public static String s;
	
	public static void main(String[] args) {
		
		try 
		{
			int n=s.length();
			System.out.println(10/n);
		}
		catch(NullPointerException e)
		{
			System.out.println("Please initialize the String");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Please specify chars in the String");
		}
		catch (Exception e)//this must be the last block
		{
			System.out.println("All other exception types");
		}
		
	}

}
