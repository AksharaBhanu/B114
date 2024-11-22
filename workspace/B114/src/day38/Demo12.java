package day38;

import java.util.ArrayList;

class Student
{
	int id;
	String name;
	
	Student(int id,String name)
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
public class Demo12 {

	public static void main(String[] args) {
		ArrayList<Student> list1=new ArrayList<Student>();
		
		list1.add(new Student(1,"Akash"));
		list1.add(new Student(2,"Bhavya"));
		list1.add(new Student(3,"Chandana"));
		
		System.out.println(list1);//[day38.Student@s123]

	}

}
