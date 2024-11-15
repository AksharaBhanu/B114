package day34;

//architect has created WebDriver interface
interface WebDriver
{
	void openBrowser();
	void enterURL();
	void closeBrowser();
}
//2 developer 

class Chrome implements WebDriver
{

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");
		
	}

	@Override
	public void enterURL() {
		System.out.println("Enter URL in Chrome Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
		
	}
	
}

class Firefox implements WebDriver
{
	@Override
	public void openBrowser() {
		System.out.println("Open Firefox Browser");
		
	}

	@Override
	public void enterURL() {
		System.out.println("Enter URL in Firefox Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Firefox Browser");
		
	}
}
//--------------------------------------------------------
public class Demo5 {

	public static void automationScript(WebDriver driver)
	{
		driver.openBrowser();
		driver.enterURL();
		driver.closeBrowser();
	}
	
	public static void main(String[] args) {
		Chrome c=new Chrome();
		Demo5.automationScript(c);
		
		WebDriver f=new Firefox();
		Demo5.automationScript(f);
		
	}

}
