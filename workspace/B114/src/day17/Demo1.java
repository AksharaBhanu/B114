package day17;

public class Demo1 {
//write a code to sort the array--bubble sort
	public static void main(String[] args) {
		int[] a= {10,9,8,7,6,5,4,3,2,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int f=a[i];
				int s=a[j];
				if(f>s)
				{
					a[i]=s;
					a[j]=f;
				}
				
				for(int v:a)
				{
					System.out.print(v+" ");
				}
				System.out.println();
			}
			
			System.out.println("---------------------------------------");
		}

		
		
	}

}
