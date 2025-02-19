package Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
public WebDriver driver; // for globally declare the driver. we can access all method and used for another class also
	public void InitializesBrower()
	{
	//WebDriver driver = new chromeDriver() - Browser Initialization command
	driver =new ChromeDriver(); // for driver loading
	driver.get("https://selenium.qabible.in/"); // for URl launch
	driver.manage().window().maximize(); // to maximize windows
	}
public void driverquitandclose()
{
	driver.quit(); // Close all the browser windows
	//driver.close(); // Close the parent window 
}
public static void main(String[] args)
	{		
	Base obj=new Base();
	obj.InitializesBrower();
	obj.driverquitandclose();
	}

}