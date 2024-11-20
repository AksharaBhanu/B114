package day37;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		Object[] b= {"Bhanu",10,true};
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b.length);
		
		ArrayList a=new ArrayList();
		a.add("Bhanu");
		a.add(10);
		a.add(true);
		
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.size());
		

	}

}
