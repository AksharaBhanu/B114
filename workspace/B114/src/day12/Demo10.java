package day12;

public class Demo10 {

	public static void main(String[] args) {
		int number,lastDigit;
		
		number=912;
		System.out.println(number);//912
		
		lastDigit=number%10;
		System.out.println(lastDigit);//2
		
		
		number=number/10;
		System.out.println(number);//91
		
		lastDigit=number%10;
		System.out.println(lastDigit);//1
		
		number=number/10;
		System.out.println(number);//9
		
		lastDigit=number%10;
		System.out.println(lastDigit);//9
		
		number=number/10;
		System.out.println(number);//0
		

	}

}
