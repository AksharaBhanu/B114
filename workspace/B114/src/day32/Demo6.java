package day32;

public class Demo6 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		
		Animal a1=(Animal)d1;//upcasting
		
		Animal a2=d1;//auto-upcasting
				
		Animal a3=new Dog();//auto-upcasting
	}

}
