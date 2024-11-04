package day25;
class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Student(String name)
	{
		this(0,name);//call constructor from another constructor
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Student s1=new Student(1,"Akash");
		System.out.println(s1.id+"-"+s1.name);
		
		Student s2=new Student("Prakash");
		System.out.println(s2.id+"-"+s2.name);

	}

}
