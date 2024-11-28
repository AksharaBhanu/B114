package day42;

import java.util.Hashtable;

public class Demo2 {

	public static void main(String[] args) {
		Hashtable<String,String> map=new Hashtable<String,String>();
		System.out.println(map);
		
		map.put("Apple", "Five");
		System.out.println(map);
		
		map.put("Apple", "SIX");
		System.out.println(map);
		
		map.put("apple", "Two");
		System.out.println(map);
		
		map.put(null,"Hi");
		System.out.println(map);

	}

}
