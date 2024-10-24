package day19;

public class Demo2 {

	public static void main(String[] args) {

		Demo2.addNumber();

	}

	public static void addNumber()
	{
		int i=10;
		int j=20;
		System.out.println(i+j);

		return;//this will transfer the control back to the caller(main method)
//		System.out.println("End");//we get error unreachable code
	}
}
