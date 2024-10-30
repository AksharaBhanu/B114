package day23;
class Student
{
	int id;
	String name,email;
	
	Student(int id,String name,String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
}
public class Demo6 {

	public static void main(String[] args) {
		Student s1=new Student(1,"Akash","akash@gmail.com");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.email);
	}

}
