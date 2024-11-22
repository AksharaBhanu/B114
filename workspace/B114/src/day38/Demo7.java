package day38;

import java.util.ArrayList;

public class Demo7 {
//searching
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(10);
		list1.add(40);
		list1.add(30);
		
		if(list1.contains(30))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
