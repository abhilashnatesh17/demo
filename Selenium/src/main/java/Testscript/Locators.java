package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

// WebElement elementname=driver.findElement(By.Locator("locator value")); - Syntax
	public void id()
	{
		WebElement id1=driver.findElement(By.id("single-input-field"));
		WebElement id2=driver.findElement(By.id("value-b"));
		WebElement id3=driver.findElement(By.id("value-a"));
		WebElement id4=driver.findElement(By.id("button-one"));
		WebElement id5=driver.findElement(By.id("button-two"));
	}
	public static void main(String[] args) {
		
		
	}

}
