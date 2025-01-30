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
	public void className()
	{
			WebElement class1=driver.findElement(By.className("header-top"));// attribute name is id, only take inside the ""
			WebElement class2=driver.findElement(By.className("mb-sec"));
			WebElement class3=driver.findElement(By.className("clearfix"));
			WebElement class4=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
			WebElement class5=driver.findElement(By.className("list-group list-group-flush"));
	}
	public void name()
	{
		WebElement name1=driver.findElement(By.name("viewport")); // attribute is name 
		WebElement name2=driver.findElement(By.name("description"));
		WebElement name3=driver.findElement(By.name("keywords"));
		WebElement name4=driver.findElement(By.name("author"));
	}
	public void linkText()
	{
		WebElement link1=driver.findElement(By.linkText("Checkbox Demo")); //link text start from angular tag"<a"and "href" and take it from text field nd mentioned in black colour
		WebElement link2=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement link3=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement link4=driver.findElement(By.linkText("Select Input"));
		WebElement link5=driver.findElement(By.linkText("Form Submit"));
		WebElement link6=driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement link7=driver.findElement(By.linkText("Jquery Select2"));
	}
	public void partialLinkText()
	{
		WebElement partiallink1=driver.findElement(By.partialLinkText("Simple Fo"));
		WebElement partiallink2=driver.findElement(By.partialLinkText("Checkbox De"));
		WebElement partiallink3=driver.findElement(By.partialLinkText("Radio But"));
		WebElement partiallink4=driver.findElement(By.partialLinkText("Select In"));
		WebElement partiallink5=driver.findElement(By.partialLinkText("Form Su"));
		WebElement partiallink6=driver.findElement(By.partialLinkText("Ajax Fo"));
	}
	public static void main(String[] args)
	{
		
		
	}

}
