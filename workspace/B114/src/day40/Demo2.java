package day40;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;
//Vector 
//1. present from JDK 1.0
//2. it is also called as legacy class
//3. implements List interface
//4. Thread Safe -allow only one Thread at a time- data will be safe
//5. slow
//6. it has method with the word 'element'
//7. underlying Data Structure is 'Dynamic Array'
//8. it will allow multiple null
//9. it will allow duplicate objects
//10. it will support index
//11. preserve insertion order

public class Demo2 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.addElement("Apple");
		v.addElement("Banana");
		v.addElement("Apple");
		v.addElement("Banana");
		v.addElement("Mango");
		System.out.println(v);
		
		v.removeElement(0);
		v.removeElement("Mango");
		System.out.println(v);
		
		v.addElement(null);
		System.out.println(v);
		System.out.println(v.get(0));

	}

}
