package day23;
class E{
	int i=10;
	int j=20;
	E(){
		int j=200;
		System.out.println(this.i);//10
		System.out.println(i);//10
		System.out.println(this.j);//20
		System.out.println(j);//200
	}
}
public class Demo4 {

	public static void main(String[] args) {
		E e1=new E();
		System.out.println(e1.i);//10
		System.out.println(e1.j);//20
	}

}
