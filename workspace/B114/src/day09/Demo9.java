package day09;

public class Demo9 {
//convert if-else into switch
	public static void main(String[] args) {
		
		int i=1;
		
		if(i==1)
		{
			System.out.println("It is One");
		}
		else
		{
			System.out.println("it is not One");
		}

		switch(i)
		{
			case 1:
					System.out.println("It is One");
					break;
					
			default:
					System.out.println("it is not One");
		}
		
	}

}
