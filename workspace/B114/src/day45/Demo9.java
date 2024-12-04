package day45;

public class Demo9 {

	public static void main(String[] args) {
		String msg="This is java";
		String[] s = msg.split(" ");
		for(String v:s)
		{
			System.out.println(v);
		}
		
		
		String msg2 = String.join("-", s);
		System.out.println(msg2);//This-is-Java
	}

}
