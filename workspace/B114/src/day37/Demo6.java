package day37;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Grapes");
		System.out.println(list1);//A O G
		
		List<String> list2=new ArrayList<String>();
		list2.add("Chiku");
		list2.add("Banana");
		System.out.println(list2);//C B
		
		list1.addAll(list2);
		System.out.println(list1);//A O G C B
		
		list1.removeAll(list2);
		System.out.println(list1);//A O G

	}

}
