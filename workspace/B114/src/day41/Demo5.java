package day41;

import java.util.HashSet;

public class Demo5 {

	public static void main(String[] args) {
		HashSet<String> a=new HashSet<String>();
		a.add("A");
		a.add("D");
		a.add("B");
		a.add("A");
		a.add("C");
		a.add(null);
		a.add(null);
		a.add("a");
		System.out.println(a);//A D B C null a
		
		for(String v:a)
		{
			System.out.println(v);
		}

	}

}
