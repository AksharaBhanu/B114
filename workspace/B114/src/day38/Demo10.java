package day38;

import java.util.ArrayList;

public class Demo10 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		
		String s1=new String("Apple");
		list1.add(s1);
		
		String s2="Apple";
		list1.add(s2);
		
		list1.add("Apple");
		
		System.out.println(list1);
		
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		Integer i1=new Integer(10);
		list2.add(i1);
		
		Integer i2=10;
		list2.add(i2);
		
		list2.add(10);
		
		System.out.println(list2);

	}

}
