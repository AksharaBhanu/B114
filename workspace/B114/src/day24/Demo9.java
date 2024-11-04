package day24;

public class Demo9 {
//print sum of odd numbers between 1 to 10---> 1 3 5 7 9
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers:"+sum);
		//print sum of even numbers between 1 to 10---> 2 4 6 8 10
		sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers:"+sum);
	}

}
