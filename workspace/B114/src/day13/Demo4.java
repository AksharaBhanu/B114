package day13;

public class Demo4 {

	public static void main(String[] args) {
		String[] a= {"Apple","Mango"};
		System.out.println(a[0]);//Apple
		System.out.println(a[1]);//Mango
		System.out.println(a.length);//2
		
		for(int i=0;i<2;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
