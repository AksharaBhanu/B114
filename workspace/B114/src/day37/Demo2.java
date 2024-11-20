package day37;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add("Apple");
		list1.add(100);
		list1.add(true);
		System.out.println(list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Apple");
		list2.add("Orange");
		list2.add("Banana");
		System.out.println(list2);

	}

}
