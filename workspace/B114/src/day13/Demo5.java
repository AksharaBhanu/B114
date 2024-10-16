package day13;

public class Demo5 {

	public static void main(String[] args) {
		int[] a= {10,15,25,50,60,70};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("----");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
