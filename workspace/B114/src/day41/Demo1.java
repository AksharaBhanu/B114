package day41;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) {
		LinkedList<String> q=new LinkedList<String>();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer(null);
		q.offer(null);
		System.out.println(q.isEmpty());//false
		System.out.println(q.size());
		System.out.println(q);//[A B C]
		System.out.println(q.peek());//who is at the front of the queue--> A
	
//		q.poll();//get the service and exit the q
//		
//		System.out.println(q);//[B C]
//		
//		q.poll();
//		System.out.println(q);//[C]
//		
//		q.poll();
//		System.out.println(q);//[]
//		System.out.println(q.isEmpty());//true
//		
//		q.poll();
//		System.out.println(q);//[]
	}

}
