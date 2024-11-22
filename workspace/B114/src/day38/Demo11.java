package day38;

import java.util.ArrayList;
//using collection to store user defined class objects
//String- built in class
//Emp-- user defined class
class Emp
{
	
}
public class Demo11 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		
		String s1=new String("Apple");
		list1.add(s1);
		System.out.println(list1);
		
		
		ArrayList<Emp> list2=new ArrayList<Emp>();
		
		Emp e1=new Emp();
		list2.add(e1);
		

		list2.add(new Emp());
		list2.add(new Emp());
		System.out.println(list2);
		
	}

}
