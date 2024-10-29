package day22;
class Fruit
{
	Fruit()//user defined constructor
	{
		System.out.println("This is Constructor");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		
		Fruit f=new Fruit();
		System.out.println(f);//day22.Fruit@f123
	}

}
