package day38;

import java.util.ArrayList;

public class Demo6 {
//searching
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(10);
		list1.add(40);
		list1.add(30);
		
		int expected =20;
		String msg="Not Found";
		
		for(Integer v:list1)
		{
			if(v==expected)
			{
				msg="Found";
				break;
			}
			
		}
		
		System.out.println(msg);
	}

}
