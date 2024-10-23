package day18;

public class Demo1 {

	public static void main(String[] args) {
		int n=7;
		String msg="It is a Prime number";
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				msg="It is NOT a Prime number";
				break;
			}
		}

		System.out.println(msg);
	}

}
