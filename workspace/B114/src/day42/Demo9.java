package day42;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Demo9 {
//Q4. print all items present in list without repeating it
	public static void main(String[] args) {
		
		ArrayList<String> foodList=new ArrayList<String>();
		foodList.add("Idly");
		foodList.add("Dose");
		foodList.add("Idly");
		foodList.add("Pongal");
		foodList.add("Idly");
		foodList.add("Dose");
		foodList.add("Poori");
		foodList.add("Vade");
		
		LinkedHashMap<String,Integer> foodMap=new LinkedHashMap<String,Integer>();
		
		for(String  item:foodList)
		{
			if(foodMap.containsKey(item))
			{
				Integer value = foodMap.get(item);
				value++;
				foodMap.put(item, value);
			}
			else
			{
				foodMap.put(item, 1);
			}
			
		}
		
	
		for(String key:foodMap.keySet())
		{
			
				System.out.println(key);
		}
		
	}
}
