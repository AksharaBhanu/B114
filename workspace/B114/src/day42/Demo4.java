package day42;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo4 {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
		
		System.out.println(map);
		
		map.put("Apple", "Five");
		System.out.println(map);
		
		map.put("Apple", "SIX");
		System.out.println(map);
		
		map.put("apple", "Two");
		System.out.println(map);
	
		map.put("Orange", "Three");
		System.out.println(map);
		
		map.put(null,null);
		System.out.println(map);

	}

}
