package day41;

import java.util.ArrayDeque;

public class Demo2 {

	public static void main(String[] args) {
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.offerFirst("A");
		q.offerLast("B");

		q.offerFirst("C");
		q.offerLast("D");
		q.offerFirst("A");

		System.out.println(q);//[C A B D]
		
		q.pollFirst();
		System.out.println(q);//[ A B D]
		
		q.pollLast();
		System.out.println(q);//[A B]
		
		q.pollFirst();
		System.out.println(q);//[ B]
		
		q.pollLast();
		System.out.println(q);//[]
	}

}
