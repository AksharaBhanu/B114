package day17;

public class Demo2 {
// 4--> 4 * 3 * 2 * 1
	public static void main(String[] args) {
		
		int n=4;
		int factorial=1;
		for(int i=n;i>0;i--)
		{
			factorial=factorial*i;
		}
		
		System.out.println(factorial);
	}

}
