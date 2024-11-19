package day36;
class D<T> //generic class--can handle any data type
{
	T v;
	
	D(T v)
	{
		this.v=v;
	}
	
	T getValue()
	{
		return v;
	}
}


public class Demo5 {

	public static void main(String[] args) {
		D<Integer> d1=new D<Integer>(10);
		System.out.println(d1.getValue());
		
		D<Boolean> d2=new D<Boolean>(true);
		System.out.println(d2.getValue());

		D<String> d3=new D<String>("Bhanu");
		System.out.println(d3.getValue());	

		

	}

}
