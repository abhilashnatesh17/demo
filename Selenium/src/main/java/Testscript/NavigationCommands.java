package Testscript;

public class NavigationCommands extends Base {
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/"); // to navigate one browser to another browser
		driver.navigate().back(); // navigate back to the pervious browser
		driver.navigate().forward(); // used to navigate forward
		driver.navigate().refresh(); // refresh the current page
	}

	public static void main(String[] args) 
	{
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.InitializesBrower();
		navigationcommands.navigationCommands();
	
		

	}

}
