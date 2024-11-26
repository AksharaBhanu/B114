package day40;

import java.util.LinkedList;

public class Demo4 {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Apple");
		list1.add("Apple");
		list1.add("Orange");
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		System.out.println(list1.get(0));

	}

}
