package day40;

import java.util.Stack;

public class Demo3 {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
	
		s.push("Manual Testing");
		s.push("java");
		s.push("Selenium");
		
		System.out.println(s);//MT J S
		
		System.out.println(s.peek());//who is at the top--> S

		s.pop();
		System.out.println(s);//MT J
		
		s.pop();
		System.out.println(s);//MT 
		
		s.pop();
		System.out.println(s);//
		
		s.pop();//EmptyStackException
	}

}
