package day30;
class Account1
{
	 public int balance=1000;  //any one can access and any one can modify
}

class Account2
{
	private int balance=1000;//no one can access
	
}

class Account3
{
	private int balance=1000;//no one can modify
	
	public void checkBalance()//access it
	{
		System.out.println(balance);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Account1 a1=new Account1();
		a1.balance=2000;//write 
		System.out.println(a1.balance);//read
				
		Account2 a2=new Account2();
//		a2.balance=2000;//no write
//		System.out.println(a2.balance);//no read
		
		Account3 a3=new Account3();
//		a3.balance=2000;//no write 
//		System.out.println(a3.balance);
		a3.checkBalance();

	}

}
