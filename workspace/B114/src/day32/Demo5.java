package day32;

class Belt
{
	
}
class Animal
{
	
}

class Dog extends Animal
{
	Belt belt=new Belt();
}
//Dog IS-A animal
//Dog HAS-A Belt
public class Demo5 {

	public static void main(String[] args) {
		//in java 2 types of relation ships
		//1. IS-A relation
		//2 HAS-A relation ship
		
		//A class can be related to another class in 2 ways
		
		int i=10;
		byte b=(byte)i;//from int to byte
		
		
		Animal a1=new Animal();
		Dog d1=new Dog();
		Belt b1=new Belt();
		//converting from child object to parent type

		Animal a2=(Animal)d1;//from Dog to Animal-IS-A
		//from Child to Parent
		Animal a3=d1;//auto upcasting
		
		
		
	}

}
