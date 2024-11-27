package day41;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo8 {

	public static void main(String[] args) {
	 ArrayList<Integer> items=new ArrayList<Integer>();
	 items.add(1); //Board--0
	 items.add(10);//chairs---1
	 items.add(2);// marker--2
	 
	 System.out.println(items);
	 System.out.println(items.size());
	 System.out.println(items.get(0));//get number of Board
	 System.out.println(items.get(1));//get number of Chairs
	 System.out.println(items.get(2));//get number of markers
	 

	 HashMap<String,Integer> map=new HashMap<String,Integer>();
	 map.put("board", 1);
	 map.put("chair", 10);
	 map.put("marker",2);
	 System.out.println(map);
	 System.out.println(map.size());
	 
	 System.out.println(map.get("board"));//get number of Board
	 System.out.println(map.get("chair"));//get number of Chairs
	 System.out.println(map.get("marker"));//get number of markers
	}

}
