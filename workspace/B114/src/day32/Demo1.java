package day32;
class Student
{
	String name;
	int id;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return id+"-"+name;
	}
	
}
public class Demo1 {
public static void main(String[] args) {
	Student s1=new Student("Geeta",1);
	System.out.println(s1);
	
	Student s2=new Student("Umesh",2);
	System.out.println(s2);
}
}
