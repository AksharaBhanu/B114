package day07;

public class Demo5 {

	public static void main(String[] args) {
		char gender='M';
		int age=28;
		
		String result=(gender=='M' && age>=21)? "You can Marry": "You cant Marry";
		System.out.println(result);
		
		gender='F';
		age=17;
		result=(gender=='F' && age>=18)? "You can Marry": "You cant Marry";
		System.out.println(result);
	}

}
