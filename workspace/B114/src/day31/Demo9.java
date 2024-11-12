package day31;
class Emp
{
	String name;
	
	Emp(String name)
	{
		this.name=name;
	}
	
	public String toString() {
        return name;
    }
}
public class Demo9 {

	public static void main(String[] args) {

		Emp e1=new Emp("Sarthak");
		System.out.println(e1);//day31.Emp@372f7a8d
		//for println we are sending e1 which is non-primitive data type
		// if the input is non-primitive data type, then println will call toString method 
		// in this Emp class, toString method  overriden , it returns emp name instead of address

	}

}
