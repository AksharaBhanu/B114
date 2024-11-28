package day42;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo5 {

	public static void main(String[] args) {
		TreeMap<String,String> map=new TreeMap<String,String>();
		
		System.out.println(map);
		
		map.put("Apple", "Five");
		System.out.println(map);
		
		map.put("Apple", "SIX");
		System.out.println(map);
		
		map.put("apple", "Two");
		System.out.println(map);
	
		map.put("Orange", "Three");
		System.out.println(map);
		
		map.put("Banana",null);
		System.out.println(map);
		
		map.put(null,null);
		System.out.println(map);

	}

}
