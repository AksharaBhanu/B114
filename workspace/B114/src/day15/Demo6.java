package day15;

public class Demo6 {

	public static void main(String[] args) {
		
		int[] b= {10,20,30};
		for(int v:b)
		{
			System.out.println(v);
		}
		System.out.println("---");
		
		int[][] a = {{10,20},{30,40,50},{60,70,80,90},{15,45}};
	
		for(int[] v:a)
		{
			for(int p:v)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}

	}

}
