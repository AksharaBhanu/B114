package day23;
class A
{
	int i;
	int j;
	int k;
	A(int x,int y,int z)
	{
		i=x;
		j=y;
		k=z;
	}
}
public class Demo1 {

	public static void main(String[] args) {

		A a1=new A(10,20,30);
		
		System.out.println(a1+" "+a1.i+" "+a1.j+" "+a1.k);
		
		A a2=new A(40,50,60);
		
		System.out.println(a2.i+" "+a2.j+" "+a2.k);
	}

}
