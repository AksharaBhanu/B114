package day38;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	int id;
	String name;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return id+"-"+name;
	}
}
public class Demo13 {

	public static void main(String[] args) {
		ArrayList<Employee> list1=new ArrayList<Employee>();
		
		list1.add(new Employee(1,"Akash"));
		list1.add(new Employee(2,"Bhavya"));
		list1.add(new Employee(3,"Chandana"));
		
		System.out.println(list1);
		
		List<Employee> list2 = list1.reversed();
		
		System.out.println(list2);
		
		list2.sort(null);
		
		System.out.println(list2);

	}

}
