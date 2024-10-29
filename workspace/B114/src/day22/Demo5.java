package day22;
class Dog
{
	String name;
	
	Dog()
	{
		System.out.println(name);
		name="Pinky";
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
	
		Dog d1=new Dog();
		System.out.println(d1.name);
	}

}
