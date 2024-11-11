package day30;
class D
{
	//declaration
	private int amount;
	
	//initialization
	D(int amount)
	{
		this.amount=amount;
	}
	
	//utilization
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
public class Demo4 {

	public static void main(String[] args) {
		D d1=new D(100);
		System.out.println(d1.getAmount());
		
		d1.setAmount(300);
		System.out.println(d1.getAmount());
		

	}

}
