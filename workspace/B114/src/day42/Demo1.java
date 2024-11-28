package day42;

import java.util.Hashtable;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> map=new Hashtable<Integer, String>();
		map.put(1,"Apple");
		map.put(7,"Mango");
		map.put(10,"Grapes");
		
		System.out.println(map.size());
		
		String v = map.get(1);
		System.out.println(v);
		
		System.out.println(map);
		
		System.out.println(map.containsKey(7));
		
		System.out.println(map.containsKey(2));
		
		System.out.println(map.containsValue("Apple"));
		
		System.out.println(map.containsValue("Banana"));
		
		Set<Integer> allkeys = map.keySet();
		for(Integer key:allkeys)
		{
			System.out.println(key);//print all the keys
		}
		
		for(Integer key:allkeys)
		{
			System.out.println(map.get(key));//print all the values
		}
		
		System.out.println(map.isEmpty());//false
		
		System.out.println(map);
		map.remove(7);
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
	}

}
