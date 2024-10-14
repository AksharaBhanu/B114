package day11;

public class Demo9 {
//pattern printing
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

		System.out.println();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println();
		}
	}

}
