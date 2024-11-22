package day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(10);
		list1.add(40);
		list1.add(30);
		
		System.out.println(list1);//20 10 40 30
		
		List<Integer> list2 = list1.reversed();
		System.out.println(list2);//30 40 10 20	
		
		Collections.sort(list1);
		System.out.println(list1);//10 20 30 40 	
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);//40 30 20 10
		
	}
}
