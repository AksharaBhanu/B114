package day37;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println(list1.isEmpty());//true
		System.out.println(list1.size());//0
		list1.add(10);
		list1.add(20);
		list1.add(30);//append
		System.out.println(list1.isEmpty());//false
		System.out.println(list1);
		System.out.println(list1.size());//3
		
		list1.add(1, 15);//insert
		System.out.println(list1.size());//4
		System.out.println(list1);
		
		list1.set(1, 17);//modify
		System.out.println(list1.size());//4
		System.out.println(list1);
		
		list1.remove(1);
		System.out.println(list1.size());//3
		System.out.println(list1);//10 20 30
		
		Integer obj=20;
		list1.remove(obj);
		System.out.println(list1.size());//2
		System.out.println(list1);//10 30
		
		list1.clear();
		System.out.println(list1.isEmpty());//true
		System.out.println(list1.size());//0
		System.out.println(list1);
		
		

	}

}
