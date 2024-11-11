package day30;
class BankAccount
{
	private int balance;
	private int pin;
	
	BankAccount(int balance,int pin)
	{
		this.balance=balance;
		this.pin=pin;
	}
	
	public void checkBalance(int pin) 
	{
		if(pin==this.pin)
		{
			System.out.println("Your Account Balance is:"+balance);
		}
		else
		{
			System.out.println("Sorry invalid pin");
		}
	}
	//Home work: withdraw
	public void deposit(int amount)
	{
		balance=balance+amount;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		BankAccount bhanuAccount=new BankAccount(1000,123);
		bhanuAccount.checkBalance(123);
		bhanuAccount.checkBalance(456);
		bhanuAccount.deposit(500);
		bhanuAccount.checkBalance(123);

	}

}
