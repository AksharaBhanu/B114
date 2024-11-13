package day32;

class Shape
{
	
}

class Circle extends Shape
{
	
}

class Rectangle extends Shape
{
	
}
public class Demo7 {

	public static void main(String[] args) {
		
		Shape s1=new Circle();//auto upcating-->child to parent--> Circle to Shape
		System.out.println(s1);
		
		Shape s2=new Rectangle();//auto upcating-->child to parent--> Rectangle to Shape
		System.out.println(s2);
		
		Circle c1=(Circle)s1;//explicit down casting-->parent to child--> Shape to Circle
		System.out.println(c1);
				
		Rectangle r1=(Rectangle)s2;//explicit down casting-->parent to child-->Shape to Rectangle
		System.out.println(r1);
		
		//what is not supported in java? --> direct down casting is not supported
		Circle c2=(Circle)new Shape();//We get ClassCastException
		
	}

}
