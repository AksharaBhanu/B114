package day07;

public class Demo2 {

	public static void main(String[] args) {
		char gender='M';
		int age=28;
		
		System.out.println(gender=='M' && age>=21);

		
		gender='F';
		age=16;
		System.out.println(gender=='F' && age>=18);
	}

}
