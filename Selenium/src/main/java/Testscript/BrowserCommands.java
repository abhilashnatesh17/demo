package Testscript;

public class BrowserCommands extends Base {

	public void browserCommands()
	{
	String Title =driver.getTitle(); // to get title
	System.out.println(Title);
	String Url=driver.getCurrentUrl(); // to get current url
	System.out.println(Url);
	String Page=driver.getPageSource(); // to get a current page of html code
	System.out.println(Page);
	}
	public static void main(String[] args) {
		BrowserCommands browsercommands =new BrowserCommands();
		browsercommands.InitializesBrower();
		browsercommands.browserCommands();
		//browsercommands.driverquitandclose();
		

	}

}
