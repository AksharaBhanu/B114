package day45;

public class Demo6 {

	public static void main(String[] args) {
		String msg=" This is Java ";
		
		System.out.println(msg.concat("Coding"));//This is Java Coding
		
		System.out.println(msg+"Coding");//This is Java Coding
		
		System.out.println("*"+msg+"*");//* This is Java *
		
		System.out.println("*"+msg.trim()+"*");
		
		System.out.println("*"+msg.stripLeading()+"*");
		
		System.out.println("*"+msg.stripTrailing()+"*");
		
		System.out.println("*"+msg.strip()+"*");

	}

}
