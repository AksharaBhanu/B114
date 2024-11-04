package day25;
class Emp
{
	String name;
	String email;
	String id;
	
	Emp(String name,String email,String id)
	{
		this.name=name;
		this.email=email;
		this.id=id;
	}
	
	Emp(String name,String email)
	{
		this.name=name;
		this.email=email;
		this.id="A111";
	}
	
	Emp(String name)
	{
		this.name=name;
		this.email=name+"@gmail.com";
		this.id="A111";
	}
}
public class Demo1 {

	public static void main(String[] args) {

		Emp e1=new Emp("Bhanu","bhanu@gmail.com","A123");
		System.out.println(e1.name+"-"+e1.email+"-"+e1.id);
		
		Emp e2=new Emp("Ravi","Ravi@gmail.com");
		System.out.println(e2.name+"-"+e2.email+"-"+e2.id);
		
		Emp e3=new Emp("Surya");
		System.out.println(e3.name+"-"+e3.email+"-"+e3.id);
	}

}
