package day26;
class Account
{
	final static String BankName="SBI"; 
	final String PAN="ABC123";
}
public class Demo1 {

	public static void main(String[] args) {
//		Account.BankName="ABCD";
		System.out.println(Account.BankName);
		
		Account a1=new Account();
//		a1.PAN="ABC456";
		System.out.println(a1.PAN);
		System.out.println(a1.BankName);

	}

}
