package day40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student implements Comparable<Student>
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

	@Override
	public int compareTo(Student s2) {//Default Natural Sorting order
		Integer id1=this.id;
		Integer id2=s2.id;
		return id1.compareTo(id2);
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
public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Student> list1=new ArrayList<Student>();
		list1.add(new Student(7,"Bhavya"));
		list1.add(new Student(3,"Akshay"));
		list1.add(new Student(1,"Chandana"));
		System.out.println(list1);
		
		list1.sort(null);
		System.out.println(list1);
		
		Collections.sort(list1);//Comparable
		System.out.println(list1);
		
		list1.sort(new SortByName());
		System.out.println(list1);
		
		Collections.sort(list1, new SortByName());//Comparator
		System.out.println(list1);
		
	}

}
