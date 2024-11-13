package day32;

class Fruit
{
	
}
class Apple extends Fruit
{
	
}

public class Demo8 {

	public static void main(String[] args) {
		//example for auto up-casting
		Fruit f1=new Apple();
		System.out.println(f1);
		//example for explicit down casting
		Apple a1=(Apple)f1;
		System.out.println(a1);
	}

}
