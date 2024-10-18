package day15;

public class Demo8 {
//3D int array
	public static void main(String[] args) {
		int[][][] a = {{{10,20},{30,40}},{{50,60},{70,80}}};

		for(int[][] b:a)
		{
			for(int[] c:b)
			{
				for(int d:c)
				{
					System.out.println(d);
				}
			}
		}
	}

}
