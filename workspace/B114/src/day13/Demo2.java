package day13;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Start");
		int i=0;
		
		while(i<10)
		{
			i++;
			System.out.println("Hi"+i);
			if(i>3 && i<8)
			{
				continue;
			}
			System.out.println("Bye"+i);
		}

		
		System.out.println("End");
	}

}
