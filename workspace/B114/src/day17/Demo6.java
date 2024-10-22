package day17;

public class Demo6 {
//write a code to print 100 Fibonacci numbers 
//write a code to print Fibonacci numbers upto 100
	
	public static void main(String[] args) 
	{
		int f=0,s=1;
		int n;
		System.out.print(f+" ");
		System.out.print(s+" ");
		
		for(int i=1;i<=18;i++)
		{
			n=f+s;
			System.out.print(n+" ");
			f=s;
			s=n;
		}
		
		System.out.println("---------------");
		f=0;
		s=1;
		n=0;
		System.out.print(f+" ");
		System.out.print(s+" ");
		
		while(n<20)
		{
			n=f+s;

			System.out.print(n+" ");
			f=s;
			s=n;
		}
		
	}

}
