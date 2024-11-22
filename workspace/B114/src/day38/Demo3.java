package day38;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Chiku");
		list1.add("Grapes");
		
		List<String> list2 = list1.reversed();
		
		System.out.println(list1);//A B C G
		System.out.println(list2);//G C B A
		
	}
}
