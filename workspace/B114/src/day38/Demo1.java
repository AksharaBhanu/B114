package day38;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Chiku");
		list1.add("Grapes");
		int count=list1.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			String v = list1.get(i);
			System.out.println(v);
		}
		
		
	}
}
