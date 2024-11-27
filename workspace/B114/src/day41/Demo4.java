package day41;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient>
{
	int token;
	String name;
	
	Patient(int token,String name)
	{
		this.token=token;
		this.name=name;
	}
	
	public String toString()
	{
		return token+"-"+name;
	}

	@Override
	public int compareTo(Patient p2) {
		Integer token1=this.token;
		Integer token2=p2.token;
		return token1.compareTo(token2);
	}
}

public class Demo4 {

	public static void main(String[] args) {

		
		PriorityQueue<Patient> q=new PriorityQueue<Patient>();
		q.offer(new Patient(2,"C"));
		q.offer(new Patient(1,"B"));
		q.offer(new Patient(3,"D"));
		
		System.out.println(q);//[1-B,2-C,3-D]
		
		q.poll();
		System.out.println(q);//[2-C,3-D]
		
		q.poll();
		System.out.println(q);//[3-D]
		
		q.poll();
		System.out.println(q);//[]
		
	}

}
