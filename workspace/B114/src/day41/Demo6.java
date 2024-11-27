package day41;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo6 {

	public static void main(String[] args) {
		LinkedHashSet<String> a=new LinkedHashSet<String>();
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
