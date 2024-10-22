package day17;

public class Demo5 {
//Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones
	public static void main(String[] args) {
		int f=0,s=1;
		int n;
		System.out.print(f+" ");
		System.out.print(s+" ");
		
		for(int i=1;i<=5;i++)
		{
			n=f+s;
			System.out.print(n+" ");
			f=s;
			s=n;
		}

	}

}
