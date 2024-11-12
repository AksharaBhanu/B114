package day31;
class Bank
{
	//login using email
	public static void login(String email)
	{
		System.out.println("loginWithEmail");
	}
	
	//login using ph
	public static void login(int ph)
	{
		System.out.println("loginWithPh");
	}
	
	
}
public class Demo5 {

	public static void main(String[] args) {
		
		Bank.login("bhanu@gmail.com");
		Bank.login(1234);
	}

}
