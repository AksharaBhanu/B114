package day32;
class Emp
{
	String name;
	int id;
	int salary;
	
	Emp(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+"-"+name;
	}
	
	public boolean equals(Emp e2)
	{
		return this.id==e2.id && this.salary==e2.salary;
	}
	
}
public class Demo2 {
public static void main(String[] args) {
	
	Emp e1=new Emp("Rakesh",1,25000);
	System.out.println(e1);
	
	Emp e2=new Emp("Rakesh",1,25000);
	System.out.println(e2);
	
	Emp e3=new Emp("Rashmi",2,25000);
	System.out.println(e2);
	
	if(e1.equals(e2))
	{
		System.out.println("Id of both emp is same");
	}
	else
	{
		System.out.println("Id of both emp is diff");
	}
	
	if(e1.equals(e3))
	{
		System.out.println("Id of both emp is same");
	}
	else
	{
		System.out.println("Id of both emp is diff");
	}
}
}
