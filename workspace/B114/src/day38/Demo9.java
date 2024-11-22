package day38;

import java.util.ArrayList;

public class Demo9 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Banana");
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Chiku");
		list1.add("PinkApple");
		
		
		System.out.println(list1.contains("Apple"));//true
		
		System.out.println(list1.contains("Orange"));//false
		
		System.out.println(list1.contains("Pink"));//false
		
		System.out.println(list1.contains("chiku"));//false
		
		
	}

}
