package day37;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Apple");

		
		System.out.println(list1);
		
		list1.remove("Apple");//it will remove 1st matching object
		
		list1.remove("grapes");//if the object present it will remove it, else it will not throw any error
		
//		list1.remove(4);//IndexOutOfBoundsException
		
		System.out.println(list1);

	}

}
