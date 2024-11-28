package day42;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Demo6 {
//Q1. print items present in list along with its occurrence
	public static void main(String[] args) {
		
		ArrayList<String> foodList=new ArrayList<String>();
		foodList.add("Idly");
		foodList.add("Dose");
		foodList.add("Idly");
		foodList.add("Pongal");
		foodList.add("Idly");
		foodList.add("Dose");
		
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
		
		System.out.println(foodList);
		System.out.println(foodMap);
		
	}
}
