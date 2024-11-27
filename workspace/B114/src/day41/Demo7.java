package day41;

import java.util.TreeSet;

public class Demo7 {

	public static void main(String[] args) {
		TreeSet<String> a=new TreeSet<String>();
		a.add("A");
		a.add("D");
		a.add("B");
		a.add("A");
		a.add("C");

		System.out.println(a);//A B C D
		
		for(String v:a)
		{
			System.out.println(v);
		}

	}

}
