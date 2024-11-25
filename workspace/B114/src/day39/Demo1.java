package day39;

import java.util.ArrayList;
class Emp
{
	int id;
	String name;
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+name;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Orange");
		System.out.println(list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		System.out.println(list2);
		
		ArrayList<Emp> list3=new ArrayList<Emp>();
		list3.add(new Emp(1,"Rakesh"));
		list3.add(new Emp(2,"Geeta"));
		System.out.println(list3);

	}

}
