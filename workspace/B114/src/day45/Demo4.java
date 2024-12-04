package day45;

public class Demo4 {

	public static void main(String[] args) {
		
		System.out.println("Apple".compareTo("Apple"));//0  s1==s2
		
		System.out.println("Apple".compareTo("Banana"));//-1 s1<s2
		
		System.out.println("Banana".compareTo("Apple"));//1  s2>s2
		
		System.out.println("Apple".compareTo("Chiku"));//-2
	}

}
