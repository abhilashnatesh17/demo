package Testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class AlertHandling extends Base {
	public void simpleAlert()																																											 																												
	{																										// ALERT METHODS:
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");							//	1. simple alert
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));					//	2. confrimation alert
		alert.click();																						//	3. prompt alert
		driver.switchTo().alert().accept();	
		
																											//	Accept - Ok nammake click chynamankil accept method use chyanam
		}																									//	Dismiss- Cancel 
	public void confirmAlert()																				//	Sendkeys - text
	{									
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")); // Eth locators use chythalum kitum but xpath use chyumbo kittum chance koduthal ane
		alert.click(); // eth popup box varum
		//driver.switchTo().alert().accept(); // switchto().alert() - use cheyunath switch chyen vendite to alert popupil then accept()- use chyunath ok select chyen vendi 
		driver.switchTo().alert().dismiss();
	}
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("HELLO");
		driver.switchTo().alert().accept();
		
	}
	public static void main(String[] args) {
		
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.InitializesBrower();
		//alerthandling.simpleAlert();
		//alerthandling.confirmAlert();
		alerthandling.promptAlert();

	}

}
