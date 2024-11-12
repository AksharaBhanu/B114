package day31;
class F
{
	
}
public class Demo8 {

	public static void main(String[] args) {

		F f1=new F();
		System.out.println(f1.toString());//day31.F@372f7a8d
		System.out.println(f1);//if the input is non-primitive data tyoe then internally println method calls toString method
		
		int i=10;
		System.out.println(i);//it will just print value of i as it is primitive 
	}

}
