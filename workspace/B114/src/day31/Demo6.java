package day31;
class Father
{
	//public>protected>pp>private
	void property()
	{
		System.out.println("Gold Car land House");
	}
	
	public  void marriage()
	{
		System.out.println("Arranged Marriage");
	}
	
}
class Son extends Father
{
	public void marriage()
	{
		System.out.print("love ");
		super.marriage();
	}
}

public class Demo6 {

	public static void main(String[] args) {

		Son s1=new Son();
		s1.property();
		s1.marriage();

	}

}
