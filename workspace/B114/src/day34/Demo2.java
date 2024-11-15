package day34;
interface Animal
{
	void makeSound();
	
}

class Dog implements Animal
{

	@Override
	public void makeSound() {
	 System.out.println("Bow Bow");
	}
	
}

class Cat implements Animal
{
	@Override
	public void makeSound() {
	 System.out.println("Meow Meow");
	}
}

class Cow implements Animal
{
	@Override
	public void makeSound() {
	 System.out.println("Amba");
	}
}


public class Demo2 {

	public static void main(String[] args) {
		
		int i;
		i=10;
		
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for(int v:a)
		{
			System.out.println(v);
		}
		
		int[] b= {10,20,30};
		
		for(int v:b)
		{
			System.out.println(v);
		}
		
		Dog d1=new Dog();
		d1.makeSound();
		
		Dog[] allDogs=new Dog[3];
		allDogs[0]=new Dog();
		allDogs[1]=new Dog();
		allDogs[2]=new Dog();
		
		for(Dog dog:allDogs)
		{
			dog.makeSound();
		}
		
		Dog[] all3Dog= {new Dog(),new Dog(),new Dog()};
		for(Dog dog:all3Dog)
		{
			dog.makeSound();
		}
		
		//create cat array and call makeSound method of each cat object
		Cat[] allCats= {new Cat(),new Cat(),new Cat()};
		for(Cat cat:allCats)
		{
			cat.makeSound();
		}
	}

}
