package Testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class MultipleWindowHandling extends Base{
	public void multipleWindowHandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parentwindow=driver.getWindowHandle(); // getWindowHandling string ayath kondu string variable assinge chythe kodukanm
		System.out.println("Parent Window is : "+parentwindow);
		
		Set<String> allwindows=driver.getWindowHandles(); // onile koduthal windows ayath kond set<string> koduth
	
		
		for(String temp:allwindows)
		{
			System.out.println("All Window is "+temp); //parent tab ane print akune
			driver.switchTo().window(temp); // oro window switch chyn vendi
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("**********************************************************************");
		}   
		
	}
	

	public static void main(String[] args)
	{
		MultipleWindowHandling multiplewindow=new MultipleWindowHandling();
		multiplewindow.InitializesBrower();
		multiplewindow.multipleWindowHandling();
		
	}

}
