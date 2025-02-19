package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BrowserInitilazation {
	
	public void simpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alert=driver.findElement(By.id("alertButton"));
		alert.click();
		driver.switchTo().alert().accept();
	}
	
	public void confirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alert1=driver.findElement(By.id("confirmButton"));
		alert1.click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	
	public void promptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alert2=driver.findElement(By.id("promtButton"));
		alert2.click();
		driver.switchTo().alert().sendKeys("HELLO");
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browser();
		//alerthandling.simpleAlert();
		//alerthandling.confirmAlert();
		alerthandling.promptAlert();

	}

}
