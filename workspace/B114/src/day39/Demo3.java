package day39;

import java.util.ArrayList;
import java.util.Comparator;

class MySorting1 implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		Integer id1=e1.id;
		Integer id2=e2.id;
		return id1.compareTo(id2);//ascendant order
	}
	
}

class MySorting2 implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1, Emp e2) {
		Integer id1=e1.id;
		Integer id2=e2.id;
		return -id1.compareTo(id2);
	}
}

class MySorting3 implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		String name1=e1.name;
		String name2=e2.name;
		return name1.compareTo(name2);
	}
	
}

class MySorting4 implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		String name1=e1.name;
		String name2=e2.name;
		return -name1.compareTo(name2);
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		ArrayList<Emp> list3=new ArrayList<Emp>();
		list3.add(new Emp(4,"Umesh"));
		list3.add(new Emp(2,"Geeta"));
		list3.add(new Emp(5,"Dyana"));
		list3.add(new Emp(1,"Rakesh"));
		list3.add(new Emp(3,"Bhanu"));
		
		list3.sort(new MySorting1());
		System.out.println(list3);
		
		
		list3.sort(new MySorting2());
		System.out.println(list3);
		
		list3.sort(new MySorting3());
		System.out.println(list3);
		
		list3.sort(new MySorting4());
		System.out.println(list3);
	}

}
