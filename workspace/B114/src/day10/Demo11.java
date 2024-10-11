package day10;

public class Demo11 {

	public static void main(String[] args) {
		System.out.println("Start");
		for(int i=1;i<=10;i++)
		{
			if(i>=3 && i<=8)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("End");
		//----------------------------------------------------------
		System.out.println("Start");
		for(int i=1;i<=10;i++)
		{
			if(i>=3 && i<=8)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End");
	}

}
