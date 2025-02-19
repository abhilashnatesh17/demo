package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitilazation {
	WebDriver driver;
	
	public void browser()
	{
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
		BrowserInitilazation browserinitilazation=new BrowserInitilazation();
		browserinitilazation.browser();
		
	}

}
