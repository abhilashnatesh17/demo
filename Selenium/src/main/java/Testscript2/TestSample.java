package Testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class TestSample extends Base
{
	public void sample()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement msg=driver.findElement(By.id("single-input-field"));
	msg.sendKeys("Hello"); //sendkeys used to enter a text (any text or value)
	WebElement button=driver.findElement(By.id("button-one"));
	button.click(); // it is used to print text value
	
	}
	public void sample1()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement value=driver.findElement(By.cssSelector("input#value-a"));
		WebElement value1=driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement gettotal=driver.findElement(By.id("button-two"));
		value.sendKeys("15");
		value1.sendKeys("5");
		gettotal.click();
	}
	public static void main(String[] args)
	{
		TestSample testsample=new TestSample();
		testsample.InitializesBrower();
		testsample.sample();
		//testsample.sample1();
		//testsample.driverquitandclose();
	}

}
