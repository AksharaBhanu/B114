package day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Banana");
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Chiku");

		
		List<String> list2 = list1.reversed();
		
		System.out.println(list1);//B A G C
		System.out.println(list2);//C G A B
		
		Collections.sort(list1);
		System.out.println(list1);	//A B C G
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);//G C B A
		
	}
}
