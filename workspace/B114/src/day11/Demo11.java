package day11;

public class Demo11 {
//pattern printing
	public static void main(String[] args) {
		char c='A';
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			
			System.out.println();
		}

	}

}
