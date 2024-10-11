package day10;

public class Demo8 {

	public static void main(String[] args) {
		System.out.println("Start");
		int i=1;
		for(;;)
		{
			System.out.println(i++);
			if(i>3)
			{
//				break;
				return;//exit the method
			}
		}
		
//		System.out.println("End");

	}

}
