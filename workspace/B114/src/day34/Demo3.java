package day34;

public class Demo3 {

	public static void main(String[] args) {
		
		Animal[] allAnimal= {new Cow(),new Dog(),new Cat(),new Cow()};
		for(Animal animal:allAnimal)
		{
			animal.makeSound();
		}

	}

}
