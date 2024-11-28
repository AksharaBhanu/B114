package day42;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Demo8 {
//Q3. print only unique items present in list
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
			Integer value = foodMap.get(key);
			if(value==1)
			{
				System.out.println(key);
			}
		}
		
	}
}
