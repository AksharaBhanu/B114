package day37;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		System.out.println(list1);
		
		
		List<Integer> list2=new ArrayList<Integer>();//auto up-casting
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		System.out.println(list2);

	}

}
