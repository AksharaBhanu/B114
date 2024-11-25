package day39;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Orange");
		list1.add("Grapes");
		list1.add("Apple");
		Collections.sort(list1);
		System.out.println(list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(20);
		list2.add(7);
		list2.add(10);
		Collections.sort(list2);
		System.out.println(list2);
		
		ArrayList<Emp> list3=new ArrayList<Emp>();
		list3.add(new Emp(1,"Rakesh"));
		list3.add(new Emp(2,"Geeta"));
//		Collections.sort(list3); // We can sort only if the class implements Comparable/Comparator interface 
		list3.sort(null);
		System.out.println(list3);

	}

}
