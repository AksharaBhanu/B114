package day35;
interface A10
{
	
}
interface B10 extends A10
{
	
}
interface C10  extends A10
{
	
}
interface D10 extends B10,C10
{
	
}
//--------------------------------------
interface A11
{
	
}
class B11 implements A11
{
	
}
interface C11  extends A11
{
	
}
class D11 extends B11 implements C11
{
	
}

public class Demo5 {

	public static void main(String[] args) {
		System.out.println("Example for hybrid inheritance");
	}

}
