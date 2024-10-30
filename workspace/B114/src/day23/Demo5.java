package day23;
class Emp
{
	int id;
	String name;
	
	Emp(int id,String name)
	{
		//GV=LV
		this.id=id;//assign local var id value to global var id 
		this.name=name;
		System.out.println(this);
	}
}
public class Demo5 {

	public static void main(String[] args) {
		Emp e1=new Emp(1, "Suhas");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1);
	}

}
