package day39;

import java.util.ArrayList;
import java.util.Comparator;

class Student
{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+name;
	}
}
class SortByName implements Comparator<Student>
{
	public int compare(Student s1, Student s2) {
		String name1=s1.name;
		String name2=s2.name;
		return name1.compareTo(name2);
	}
	
}
class SortByNameReverse implements Comparator<Student>
{
	public int compare(Student s1, Student s2) {
		String name1=s1.name;
		String name2=s2.name;
		return -name1.compareTo(name2);
	}
	
}
public class Demo4 {
//Home work; implement SortBy Student id 
	
//create List of Student, add 3 student object sort them based on name and print it
	public static void main(String[] args) {
		ArrayList<Student> list1=new ArrayList<Student>();
		list1.add(new Student(7,"Bhavya"));
		list1.add(new Student(3,"Akshay"));
		list1.add(new Student(1,"Chandana"));
		System.out.println(list1);
		
		list1.sort(new SortByName());
		System.out.println(list1);
		
		list1.sort(new SortByNameReverse());
		System.out.println(list1);
		

	}

}
