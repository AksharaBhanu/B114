package day14;

public class Demo1 {

	public static void main(String[] args) {
		int[] a=new int[8];
		
		int n=10;
		for(int i=0;i<a.length;i++)
		{
			a[i]=n;//writing into array
			n=n+10;
		}

		for(int i=0;i<a.length;i++)
		{
			int v=a[i];//reading from array-1st to last
			System.out.println(v);
		}
		System.out.println("--");

		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);//reading from array -last to 1st 
		}
		System.out.println("--");
		for(int i=0;i<a.length;i+=2)
		{
			System.out.println(a[i]);//skip while reading from array
		}
		System.out.println("--");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);//other than array
			}
		}
	}

}
