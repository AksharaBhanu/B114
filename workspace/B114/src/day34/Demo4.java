package day34;
interface Shape
{
	void findArea();
}

class Square implements  Shape
{
	public void findArea()
	{
		System.out.println("calculate area=lxb");
	}
}

class Circle implements Shape
{
	public void findArea()
	{
		System.out.println("calculate area=22/7*r*r");
	}
}

class Triangle implements Shape
{
	public void findArea()
	{
		System.out.println("calculate area=1/2*h*b");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		//create array and store all 3 shapes and call findArea method of all the 3
		Shape[] allShapes= {new Square(),new Circle(),new Triangle()};
		
		for(Shape s:allShapes)
		{
			s.findArea();
		}
	}

}
