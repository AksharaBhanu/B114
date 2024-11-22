package day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(10);
		list1.add(40);
		list1.add(30);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		
		
		list1.sort(null);
		System.out.println(list1);
		
		list1.sort(Collections.reverseOrder());
		System.out.println(list1);
	}
}
