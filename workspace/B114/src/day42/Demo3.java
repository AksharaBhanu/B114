package day42;

import java.util.HashMap;

public class Demo3 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>();
		
		System.out.println(map);
		
		map.put("Apple", "Five");
		System.out.println(map);
		
		map.put("Apple", "SIX");
		System.out.println(map);
		
		map.put("apple", "Two");
		System.out.println(map);
	
		
		map.put(null,null);
		System.out.println(map);

	}

}
